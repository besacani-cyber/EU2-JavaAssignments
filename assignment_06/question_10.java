package assignments.assignment_06;

import java.util.Scanner;

public class question_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the row number: ");
		int row = input.nextInt();
		input.close();		

		for (int i=row-1 ; ((i<=row-1)&&(i>=0)) ; i--) {
			System.out.print("#");
			for (int j=i+1 ; j<=row-1 ; j++) {
				System.out.print(" ");
			}
		System.out.println("#");
		System.out.println("");	
		}
		
	}

}
