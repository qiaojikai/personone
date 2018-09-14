package com.example.common.remote.rpc.server;

import org.apache.zookeeper.*;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.common.remote.rpc.Constant;
/**
 * 连接ZK注册中心，创建服务注册目录
 */
public class ServiceRegistry {
 
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRegistry.class);
 
    private CountDownLatch latch = new CountDownLatch(1);
 
    private String registryAddress;
 
    public ServiceRegistry(String registryAddress) {
        this.registryAddress = registryAddress;
    }
 
    public void register(String data) {
        if (data != null) {
            ZooKeeper zk = connectServer();
            if (zk != null) {
                createNode(zk, data);
            }
        }
    }
 
    private ZooKeeper connectServer() {
        ZooKeeper zk = null;
        try {
            zk = new ZooKeeper(registryAddress, Constant.ZK_SESSION_TIMEOUT, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    // 判断是否已连接ZK,连接后计数器递减.
                    if (event.getState() == Event.KeeperState.SyncConnected) {
                        latch.countDown();
                    }
                }
            });
 
            // 若计数器不为0,则等待.
            latch.await();
        } catch (IOException | InterruptedException e) {
            LOGGER.error("", e);
        }
        return zk;
    }
 
    private void createNode(ZooKeeper zk, String data) {
        try {
            byte[] bytes = data.getBytes();
//            System.out.println("bytes=="+bytes);
//            System.out.println("zk==="+zk);
            if (zk.exists(Constant.ZK_DATA_PATH, false) == null) {
                String path = zk.create(Constant.ZK_DATA_PATH, bytes, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
//                System.out.println("path=="+path);
                LOGGER.debug("create zookeeper node ({} => {})", path, data);
            }
        } catch (KeeperException | InterruptedException e) {
            LOGGER.error("", e);
        }
    }
}