package javabase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
//生产者、消费者
class Meal{
	private final int orderNum;
	public Meal(int orderNum){
		this.orderNum = orderNum;
	}
	
	public String toString(){
		return "Meal " + orderNum;
	}
}

class WaitPerson implements Runnable{
	private Restaurant restaurant;
	public WaitPerson(Restaurant restaurant){
		this.restaurant = restaurant;
	}
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()){
				synchronized (this) {
					while(null == restaurant.meal){
						wait();
					}
				}
				System.out.println("WaitPerson got " + restaurant.meal);
				synchronized (restaurant.chef) {
					restaurant.meal = null;
					restaurant.chef.notifyAll();
				}
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("WaitPerson interrupted");
		}

	}
}

class Chef implements Runnable{
	private Restaurant restaurant;
	private int count = 0;
	public Chef(Restaurant restaurant){
		this.restaurant = restaurant;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(!Thread.interrupted()){
				synchronized (this) {
					while(null != restaurant.meal){
						wait();
					}
				}
				if(++count == 10){
					System.out.println("Out of food,closing");
					restaurant.executorService.shutdownNow();
				}
				System.out.print("Order up!");
				synchronized (restaurant.waitPerson) {
					restaurant.meal = new Meal(count);
					restaurant.waitPerson.notifyAll();
				}
				TimeUnit.MICROSECONDS.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Chef interrupted");
		}
	}
	
}

public class Restaurant {
	Meal meal;
	ExecutorService executorService = Executors.newCachedThreadPool();
	WaitPerson waitPerson = new WaitPerson(this);
	Chef chef = new Chef(this);
	public Restaurant(){
		executorService.execute(waitPerson);
		executorService.execute(chef);
	}
	public static void main(String[] args){
		new Restaurant();
	}
}
