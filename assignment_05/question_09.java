package assignments.assignment_05;

import java.util.Scanner;

public class question_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number please: ");
		String number = input.next(); 
		input.close();
		
		for (int i=0;i<number.length();i++){
			System.out.println("Display Prompt: " + number.charAt(i));		
		}		

	}

}
