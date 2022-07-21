package com.basics.training;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		
		String[] stuArray;
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter array size in int only:");
		  int n=sc.nextInt();
		 
		 stuArray= new String[n];
		 
		 for(int i=0; i<stuArray.length; i++) {
			 System.out.println("Please enter name for position of"+i);
			 stuArray[i]=  sc.next();
		 }
				
		int counter=0;		
		while(counter<= stuArray.length-1) {
			System.out.println("Name is:" + stuArray[counter]);
			counter++;
		}
		
	}

}
