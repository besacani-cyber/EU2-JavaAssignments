package assignments.lab_02;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {

/* This program computes the tax and tip on a restaurant bill. 
 * The program asks the user to enter the charge for the meal. 
 * The tax should be 6.75 percent of the meal charge. The tip 
 * should be 20 percent of the total after adding tax. Display 
 * the meal charge, tax amount, tip amount, and total bill on 
 * the screen.
 */

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the charge for your meal: ");
		double charge = input.nextInt();
		input.close();	

		double tax = charge*6.75/100;
		double tip = (charge+tax)*20/100;
		double totalBill = charge + tax+ tip;
		
		System.out.println("Meal Charge = " + charge);
		System.out.println("Tax Amount  = " + tax);
		System.out.println("Tip Amount  = " + tip);
		System.out.println("Total Bill  = " + totalBill);
		
		
		
	}

}
