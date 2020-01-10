package assignments.assignment_05;

import java.util.Scanner;

public class question_03 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("number: ");
		int number = input.nextInt();
		input.close();

		if (number>0) {
			System.out.println("number = " + number);
			System.out.println(number + " is positive");
		}else if (number<0) {
			System.out.println("number = " + number);
			System.out.println(number + " is negative");
		}else if (number==0) {
			System.out.println("number = " + number);
			System.out.println("it is zero");
		}	
	
	}

}