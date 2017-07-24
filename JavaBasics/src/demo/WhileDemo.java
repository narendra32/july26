package demo;

import java.util.Scanner;

public class WhileDemo {
	//private int pin =1234 ;
	
	public static void main(String[] args) {
		 int correctPin = 1234;
		Scanner k = new Scanner(System.in);
		System.out.println("please enter your pin:");
		int enteredPin = k.nextInt();
		
		while (enteredPin!= correctPin){
			System.out.println("In correct Pin ");
			System.out.println("Enter your Pin: ");
			 enteredPin = k.nextInt();
			 //System.out.println("login successfull: ");
		}
		System.out.println("login successfull.... ");
		System.out.println("The Entered PIN is " +enteredPin);
		
	}

}
