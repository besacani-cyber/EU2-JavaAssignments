package assignments.assignment_07;

import java.util.Scanner;

public class question_01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row number please:");
		int row=input.nextInt();
		input.close();
		
		for (int i=1 ; i<=row ; i++) {
			for (int j=1 ; j<=i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i=row-1 ; ((i<=row) && (i>0)) ; i--) {
			for (int j=1 ; (j<=i) ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();			
		}
		
		
		
		
	}

}
