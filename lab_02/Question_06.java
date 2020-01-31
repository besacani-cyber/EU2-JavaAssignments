package assignments.lab_02;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		
/* This program asks the user to enter the amount of a purchase. 
 * The program then computes the state and county tax sales tax. 
 * Assume the state sales tax is 4 percent and the county sales 
 * tax is 2 percent. The program should display the amount of the 
 * purchase , the state sales tax, the county sales tax, the total 
 * sales tax, and the total of the sale (which is the sum of the 
 * amount of purchase plus the total sales tax)
 */

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the amount of your purchase: ");
		double purchase = input.nextInt();
		input.close();	

		double stateSalesTax = purchase*4/100;
		double countySalesTax = purchase*2/100;
		double totalTax = stateSalesTax + countySalesTax;
		double totalSale = purchase + totalTax;
		
		System.out.println("Amount of the Purchase = " + purchase);
		System.out.println("State Sales Tax        = " + stateSalesTax);
		System.out.println("County Sales Tax       = " + countySalesTax);
		System.out.println("Total Tax              = " + totalTax);
		System.out.println("Total Sale             = " + totalSale);
		
	}

}
