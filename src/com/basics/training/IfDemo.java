package com.basics.training;

public class IfDemo {

	public static void main(String[] args) {
		int x=5;
		int y=15;
	
//		if(x>10) {
//			System.out.println("X is greater than ten");
//		} else if(x==10){
//			System.out.println("X is  equals to 10");
//		} else {
//			System.out.println("X is lessthan ten.");
//		}
		
  // logical AND will be true for both the conditions are true. 		
//		if(x>10 && y>10) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		// logical OR will be true for any one condition is true. 		
//				if(x>10 || y>10) {
//					System.out.println("true");
//				} else {
//					System.out.println("false");
//				}
		
		String str = "world..!";
	
		// to print dynamic int value we will use %d in printf method
		System.out.printf(" X is : %d", ++x );
		System.out.printf(" Y is : %d", y++ );
		System.out.println(" Y is:" + y);
		System.out.printf("Hello %s", str);
		System.out.println();
		System.out.println("Hello "+str);
	}

}
