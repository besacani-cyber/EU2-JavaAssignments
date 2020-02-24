package assignments.assignment_09;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
	
//		Write a program that will print out information about the user based on email. 
//		Print first and last name from the upper case.
//
//		Sample Output:
//		    Input: craig_federighi@apple.com
//		Output: 
//          First name: Craig
//          Last name: Federighi
//          Domain: apple
//          Top-Level Domain: com
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the email : ");
		String email = input.nextLine();
		input.close();
		
		String[] array1 = email.split("@");		
		String[] array2 = array1[0].split("_");		
		String[] array3 = array1[1].split("\\.");
		
		System.out.println("First name       : " + array2[0]);
		System.out.println("Last name        : " + array2[1]);
		System.out.println("Domain           : " + array3[0]);
		System.out.println("Top-Level Domain : " + array3[1]);

	}

}