package assignments.assignment_07;

import java.util.Scanner;

public class question_06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the row number:");
		int row = input.nextInt();
		input.close();
		int total=0;
		
		for (int i=1 ; i<=row ; i++) {
			total = i;
			System.out.print(i + " ");
			for (int j=1 ; j<i ; j++) {
				total += (row-j);
				System.out.print(total + " ");
			}
		System.out.println();
		}
			
	}

}
