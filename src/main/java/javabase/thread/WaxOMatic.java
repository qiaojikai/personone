package javabase.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//线程协作
class Car {
	private boolean waxOn = false;

	public synchronized void waxed() { // 涂蜡
		waxOn = true;
		notifyAll();
	}

	public synchronized void buffed() { // 抛光
		waxOn = false;
		notifyAll();
	}

	public synchronized void waitForWaxing() throws InterruptedException {
		while (waxOn == false) {
			wait();
		}
	}

	public synchronized void waitForBuffing() throws InterruptedException {
		while (waxOn == true) {
			wait();
		}
	}
}

class WaxOn implements Runnable {
	private Car car;

	public WaxOn(Car c) {
		car = c;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				System.out.println("Wax On!");
				TimeUnit.MICROSECONDS.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax On task");
	}
}

class WaxOff implements Runnable {
	private Car car;

	public WaxOff(Car c) {
		car = c;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				car.waitForWaxing();
				System.out.println("Wax Off!");
				TimeUnit.MICROSECONDS.sleep(200);
				car.buffed();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exiting via interrupt");
		}
		
		System.out.println("Ending Wax Off task");
	}
}

public class WaxOMatic {
	public static void main(String[] args) throws Exception{
		Car car = new Car();
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		executorService.execute(new WaxOn(car));
		executorService.execute(new WaxOff(car));
		
		TimeUnit.MICROSECONDS.sleep(2);
		executorService.shutdownNow();

	}
}
