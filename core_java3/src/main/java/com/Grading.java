package com;

public class Grading {

	public static void main(String[] args) {
		int marks=70;
		int mm=2;
		System.out.println("Using If-else");
		if(marks<=30) {
			System.out.println("Grade is: F");
			mm=4;
		}
		else if(marks<=60) {
			System.out.println("Grade is: C");
			mm=3;
		}
		else if(marks<=80) {
			System.out.println("Grade is: B");
			mm=2;
		}
		else {
			System.out.println("Grade is: A");
			mm=1;
		}
		
		System.out.println("Using Switch");
		switch(mm) {
		case 1: System.out.print("Grade is: A");
					break;
		case 2:System.out.print("Grade is: B");
				break;
				
		case 3:System.out.print("Grade is: C");
				break;
		case 4:System.out.print("Grade is: F");
		         break;
		  default:System.out.print("No Score Option");
		}
	}

}
