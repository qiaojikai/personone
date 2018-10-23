package javabase.abstracttest;

public  class Sheep extends Animal{

	public Sheep() {
		System.out.println("sheep");
	}
	@Override
	public void name() {
		System.out.println("sheep name id duoli");
	}
	
	public static void main(String[] args){
		Animal animal = new Sheep();
		animal.name();
	}

}
