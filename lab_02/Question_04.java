package assignments.lab_02;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {

/* This program asks the user for the number of males and the number of 
 * females registered in a class. Then program displays the percentage 
 * of males and females in the class.
 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of males in your class: ");
		int males = input.nextInt();
		System.out.print("Please enter the number of females in your class: ");
		int females = input.nextInt();
		input.close();
		
		System.out.println("Males percentage   = %" + (males*100)/(males+females));
		System.out.println("Females percentage = %" + (females*100)/(males+females));		
		
	}

}
