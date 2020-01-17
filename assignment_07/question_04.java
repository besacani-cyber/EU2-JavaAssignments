package assignments.assignment_07;

import java.util.Scanner;

public class question_04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the row number:");
		int row = input.nextInt();
		input.close();
		
		for (int i=1 ; i<=row ; i++) {
			for (int j=1 ; j<=i ; j++) {
				if (j%2!=0) {
					System.out.print("1");	
				}else {
					System.out.print("0");	
				}	
			}
			System.out.println("");
		}

	}

}
