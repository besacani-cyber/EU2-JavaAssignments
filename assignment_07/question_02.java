package assignments.assignment_07;

import java.util.Scanner;

public class question_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the max number:");
		int max = input.nextInt();
		input.close();
		
		for (int i=max ; ((i<=max)&&(i>1)) ; i--) {
			for (int j=1 ; j<=i ; j++) {
				System.out.print(j + " ");
			}
		System.out.println();
		}
		for (int i=1 ; (i<=max) ; i++) {
			for (int j=1 ; j<=i ; j++) {
				System.out.print(j + " ");
			}
		System.out.println();	
		}
	}

}
