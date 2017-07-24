package demo;

import java.util.Scanner;

public class BMI_Cal {
	
	public static void main (String[]args){
		Scanner bmi_1 = new Scanner(System.in);
		    double weight = 0.0;
	        double height = 0.0;
	        double bmi = 0.0;
	        System.out.println("Enter your weight in pounds:");
	        weight = bmi_1.nextInt();
	        System.out.println("Enter your height :");
	        height = bmi_1.nextDouble(); 
	        
	        bmi = ((weight * 703)/(height * height));
	        System.out.printf("Your BMI is %f\n", bmi);

	        System.out.println("BMI VALUES");
	        System.out.println("Underweight: Under 18.5");
	        System.out.println("Normal: 18.5-24.9 ");
	        System.out.println("Overweight: 25-29.9");
	        System.out.println("Obese: 30 or over");
	        	
	}

}
