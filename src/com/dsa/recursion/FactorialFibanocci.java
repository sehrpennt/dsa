package com.dsa.recursion;

public class FactorialFibanocci {
	
	public static int factorial(int n) {
		if(n == 1 || n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static int fibanocci(int n) {
		if(n <= 1) {
			return n;
		}
		return fibanocci(n-1) + fibanocci(n-2); 
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
		for(int i=0; i<=5; i++)
		System.out.print("\t"+fibanocci(i));
	}

}
