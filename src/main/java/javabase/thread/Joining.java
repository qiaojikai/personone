package javabase.thread;

class Sleeper extends Thread{
	private int duration;
	public Sleeper(String name,int sleepTime){
		super(name);
		duration = sleepTime;
		start();
	}
	
	public void run(){
		try {
			sleep(duration);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(getName() + "was interrupted. isInterrupted():" + isInterrupted());
		}
		
		System.out.println(getName() + " has awakend");
	}
}


class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name, Sleeper sleeper){
		super(name);
		this.sleeper = sleeper;
		start();
	}
	
	public void run(){
		try {
			sleeper.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Interrupted");
		}
		System.out.println(getName() + " join completed");
	}
}


public class Joining {
	public static void main(String[] args){
		Sleeper sleep = new Sleeper("Sleep", 1500);
		Sleeper grumy = new Sleeper("Grumy", 1500);
		
		Joiner dopey = new Joiner("Dopey", sleep);
		Joiner doc = new Joiner("doc", grumy);
//		grumy.interrupt();
	}
}
