package com;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=123;
		int t=n;
		int revNum=0;
		while(n>0) {
			int r=n%10;
			revNum=revNum*10+r;
			n/=10;
		}
		System.out.print("The revrse of "+t+" is "+revNum);
	}

}
