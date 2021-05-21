package com;

public class LoopingNmaes {

	public static void main(String[] args) {
		String name="Rajesh";
		System.out.println("Using For");
		for(int i=1;i<=10;i++) {
			System.out.println(i+" "+name);
		}
		
		System.out.println("Using While");
		int i=1;
		while(i<=10) {
			System.out.println(i+" "+name);
			i++;
		}

	}

}
