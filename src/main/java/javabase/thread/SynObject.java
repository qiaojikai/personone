package javabase.thread;

class DualSynch{
	private Object synObject = new Object();
	public synchronized void f(){
		for(int i = 0; i < 5; i++){
			System.out.println("f()");
			Thread.yield();
		}
	}
	
	public void g(){
		synchronized (synObject) {
			for(int i = 0; i < 5; i++){
				System.out.println("g()");
				Thread.yield();
			}
		}
	}
}

public class SynObject {
	public static void main(String[] args){
		final DualSynch ds= new DualSynch();
		new Thread(){
			public void run(){
				ds.f();
			}
		}.start();
		ds.g();
	}
}
