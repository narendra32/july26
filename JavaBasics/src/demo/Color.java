package demo;

import java.util.Scanner;

public class Color {
	
	public static void main(String[] args){
		Scanner k = new Scanner(System.in);
		System.out.println("please enter day:");
		String day = k.nextLine();
		
		//String day = "Sunday" ;
		switch(day){
		case "monday" :
		System.out.println("wear white clolor dress");
		break ;
		
		case "Tuesday" :
			System.out.println("wear yellow clolor dress");
			break ;
			
			default :
				System.out.println("please enter a valid input");
		}
	}

}
