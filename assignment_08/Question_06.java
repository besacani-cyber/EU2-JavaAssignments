package assignments.assignment_08;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int num = input.nextInt();
		input.close();
		sign(num);

	}
	
	public static void sign(int i) {
		
			System.out.println((i+1) + " " + (i+2) + " " + (i+3));
	
	}

}