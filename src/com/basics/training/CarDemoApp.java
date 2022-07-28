package com.basics.training;

public class CarDemoApp {

	public static void main(String[] args) {
		// <<ClassName>> instanceName = new ClassName();
		Car c1 = new Car();		
		c1.setName("white car");
		c1.setSeats(5);
		Car c2 = new Car("red car",7);
		
//		c2.setName("red car");
//		c2.setSeats(7);
		c2.setName("yellow car");
		c2.setSeats(4);
		
		String greeting;
		
		greeting=sayHi("Sai");
		System.out.println(greeting);
		System.out.println("My "+c1.getName()+" seat capacity is:"+c1.getSeats()+" Brand is::"+Car.brand);
		System.out.println("My "+c2.getName()+" seat capacity is:"+c2.getSeats()+" Brand is::"+Car.brand);
	}

	String sayHello(String name) {
		return CarDemoApp.getHai() + name;
	}
	
	static String sayHi(String abc) {
		CarDemoApp obj1 = new CarDemoApp();
		return obj1.sayHello(abc);
	}
	
	static String getHai() {
		return "hai";
	}
	
}

