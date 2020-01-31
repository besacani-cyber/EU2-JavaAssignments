package assignments.lab_02;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {

/* This program asks the user for a positive nonzero integer value. Then it 
 * uses a loop to get the sum of all the integers from 1 up to the number entered. 
 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a positive nonzero number: ");
		int num = input.nextInt();
		input.close();
		int total=0;
		
		for (int i=1 ; i<=num ; i++) {
			total += i;
		}
		System.out.println("Total of the numbers = " + total);

	}

}
