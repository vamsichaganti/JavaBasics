package com.basics.training;

public class CarDemoApp {

	public static void main(String[] args) {
		// <<ClassName>> instanceName = new ClassName();
		Car c1 = new Car();
		c1.setName("white car");
		c1.setSeats(5);
		Car c2 = new Car();
		c2.setName("red car");
		c2.setSeats(7);
		
		System.out.println("My "+c1.getName()+" seat capacity is:"+c1.getSeats());
		System.out.println("My "+c2.getName()+" seat capacity is:"+c2.getSeats());
	}

}
