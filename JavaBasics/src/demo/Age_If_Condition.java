package demo;

import java.util.Scanner;

public class Age_If_Condition {
	
	public static void main (String[] args){
		
		int age = 20 ;
		int age1 = 30 ;
		int age3 = 18 ;
		Scanner age_1 = new Scanner(System.in);
		   System.out.println("Enter your age:");
	        age = age_1.nextInt();
	        //System.out.println("Enter your height :");
	        //age1 = age_1.nextInt(); 
		if (age > age1) {
			System.out.println( "you cannot drive " );
		}
		if (age < age3){
			System.out.println( "you are Eligible to drive  " );
		
		
		}
	}

}
