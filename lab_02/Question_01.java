package assignments.lab_02;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {

/* This program lets the user enter a series of integer numbers. After all 
 * the numbers have been entered, the program should display the largest 
 * and smallest numbers entered.
 */
		
		int selection, nextNum, smallest=0, largest=0;
		boolean another = true;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int firstNum = input.nextInt();

		
		do {		
			System.out.print("Enter your next number: ");
			nextNum = input.nextInt();
			
			if (nextNum >= firstNum && another) {
				smallest = firstNum;
				largest = nextNum;
				another = false;
			}
			if (nextNum < firstNum && another) {
				smallest = nextNum;
				largest = firstNum;
				another = false;
			}
			
			if (nextNum >= largest) {
				largest = nextNum;
			}
			if (nextNum <= smallest) {
				smallest = nextNum;
			}			
			System.out.print("Do you want to enter another number: 0-No, 1-Yes ");
			selection = input.nextInt();
			
		}while (selection==1);
		
		input.close();
		System.out.println("Smallest Number: " + smallest);
		System.out.println("Largest Number: " + largest);
		
	}

}
