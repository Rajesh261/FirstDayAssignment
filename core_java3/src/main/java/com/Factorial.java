package com;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=4;
       int factorial=1;
       for(int i=1;i<=n;i++) {
    	  factorial*=i; 
       }
       System.out.print("Factorial of "+n+ " is "+factorial);
	}

}
