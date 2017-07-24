package demo;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		try{
   System.out.println("Please enter first number");
   int num1 = k.nextInt();
   
   System.out.println("Please enter second  number");
   int num2 = k.nextInt();
   
   System.out.println("Results of division of "+ num1 + "with" +  num2  + " =  "+(num1/num2));
		}
		
		catch(Exception e){
			System.out.println("please enter valid input ");
		}
	}

}
