package javabase.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;

//生产者-消费者与队列
class LiftOffRunner implements Runnable{

	private BlockingQueue<LiftOff> rockets;
	public LiftOffRunner(BlockingQueue<LiftOff> queue){
		rockets = queue;
	}
	
	public void add(LiftOff liftOff){
		try {
			rockets.put(liftOff);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Interrupted during put()");
		}
	}
	
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()){
				LiftOff liftOff = rockets.take();
				liftOff.run();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("waking from take()");
		}
		System.out.println("Exiting LiftOffRunner");
	}
	
}

public class TestBlockingQueues {
	static void getkey(){
		try {
			new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	static void getkey(String message){
		System.out.println(message);
		getkey();
	}
	
	static void test(String message,BlockingQueue<LiftOff> queue){
		System.out.println(message);
		LiftOffRunner runner = new LiftOffRunner(queue);
		Thread t = new Thread(runner);
		t.start();
		for(int i = 0; i < 1; i++){
			runner.add(new LiftOff(5));
		}
		getkey("Press 'Enter' ("+message+")");
		t.interrupt();
		System.out.println("Finished "+message+" test");
	}
	public static void main(String[] args) {
		test("LinkedBlockingDeque", new LinkedBlockingDeque<LiftOff>());
//		test("ArrayBlockingQueue", new ArrayBlockingQueue<LiftOff>(3));
//		test("SynchronousQueue", new SynchronousQueue<LiftOff>());
	}

}
