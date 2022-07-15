package com.basics.training;

import java.lang.*;

public class SwapDemo {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a +" and " + b);
		
		a=a+b; 
		b=a-b; //(a+b-b)
		a=a-b; //(a+b-a)
		
		System.out.println(a +" and " + b);

	}

}
