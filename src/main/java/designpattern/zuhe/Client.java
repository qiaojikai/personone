package designpattern.zuhe;

import org.junit.Test;
//组合模式: 将对象组合成树形结构以表示‘部分-整体’的层次结构, 使得用户对单个对象和组合对象的使用具有一致性.
//组合模式描述了如何将容器和叶子节点进行递归组合, 使用户在使用时可一致的对待容器和叶子, 为处理树形结构提供了完美的解决方案.
//当容器对象的指定方法被调用时, 将遍历整个树形结构, 并执行调用. 整个过程递归处理. 
public class Client {

    @Test
    public void client() {
        ImageFileLeaf image = new ImageFileLeaf("九寨沟.jpg");
        VideoFileLeaf video = new VideoFileLeaf("龙门飞甲.rmvb");
        TextFileLeaf text = new TextFileLeaf("解忧杂货店.txt");

        FolderFileComposite home = new FolderFileComposite("/home");
        home.add(image);
        home.add(video);
        home.add(text);

        FolderFileComposite root = new FolderFileComposite("/");
        root.add(home);
        root.add(new TextFileLeaf("/authorized_keys"));
        root.add(new FolderFileComposite("/etc"));

        root.killVirus(0);

    }
}
