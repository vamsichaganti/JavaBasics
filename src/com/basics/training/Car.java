package com.basics.training;

public class Car {

	//class level variables
	// static & non static or instance 
	String name; // null is the default value for String 
	int seats; // 0 is the default value for int
	public static final String brand="TATA";
	
		//default constructor 
		public Car() {
			System.out.println("Car constructor called..!!");
		}
		//two parameter constructor
		public Car(String name,int seats) {
			System.out.println("Two Parameter constructor called..!!");
			this.name=name;
			this.seats=seats;		
		}
		
	
	public void setName(String data) {
		name=data;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSeats(int count) {
		seats=count;
	}
	public int getSeats() {
		return seats;
	}
}
