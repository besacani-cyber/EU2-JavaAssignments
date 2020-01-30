package assignments.assignment_08;

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the water usage: ");
		double unit = input.nextDouble();
		input.close();
		System.out.println("Water usage: " + unit + " unit");
		System.out.println("Your Bill: " + waterTax(unit));

	}
	
	public static double waterTax(double a) {
		
		if (a<=50)
			return a*0.60;
		else if(a>50 && a<=100) {
			return a*0.90;
		}else if (a>100 && a<=150) {
			return (a*0.90)+50;
		}else {
			return (a*0.90)+100;
		}
				
	}

}
