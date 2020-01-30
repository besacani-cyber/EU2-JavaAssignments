package assignments.assignment_08;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter the number: ");
			int number = input.nextInt();
			input.close();
			System.out.println("isEven(" + number + ") --> " + isEven(number));

		}
		
		public static boolean isEven(int a) {
			if (a%2==0) {
				return true;
			}else {
				return false;
			}

	}

}
