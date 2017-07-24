package demo;
import java.util.Scanner;
public class Quiz {
	
	public static void main(String[] args){
		Scanner qui = new Scanner(System.in);
		    String reply;
		    int answer;
		    int numberofquizes = 3;
		    int q1_a1 = 1;
		    int q1_a2 = 2;
		    int q1_a3 = 3;
		    int q2_a1 = 1;
		    int q2_a2 = 2;
		    int q3_a1 = 1;
		    int q3_a2 = 2;
		    int q3_a3 = 3;	
	  System.out.print("Are you ready for this quiz?");
	    reply = qui.next();

	    System.out.println("Okay, here it comes!");
	    System.out.println("");
	    System.out.println("Q1) What is the capital of Alaska?");
	    System.out.println("    "+ q1_a1 +") Melbourne");
	    System.out.println("    "+ q1_a2 +") Anchorage");
	    System.out.println("    "+ q1_a3 +") Jouneau");

	    System.out.print("Your answer: ");
	    answer = qui.nextInt();
	    if (answer == 1)
	    {
	        System.out.println("Incorrect!");
	    }
	    else if (answer == 2)
	    {
	        System.out.println("Incorrect!");
	    }
	    else if (answer == 3)
	    {
	        System.out.println("That's right!");
	        
	        
	    }
	}
}
