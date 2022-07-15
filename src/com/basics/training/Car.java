package com.basics.training;

public class Car {

	public Car() {
		System.out.println("Car constructor called..!!");
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
