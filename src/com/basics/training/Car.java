package com.basics.training;

public class Car {

	public Car() {
		System.out.println("Car constructor called..!!");
	}
	
	public Car(String name,int seats) {
		System.out.println("Two Parameter constructor called..!!");
		this.name=name;
		this.seats=seats;		
	}
	//class level variables
	// static & non static or instance 
	String name;
	int seats;
	
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
