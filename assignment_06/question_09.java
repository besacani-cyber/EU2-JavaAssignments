package assignments.assignment_06;

import java.util.Scanner;

public class question_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 'W' or 'B' for the top left corner: ");
		char top_left_corner=input.next().charAt(0);
		input.close();		
		int row=8;
		int column=8;
		
		switch (top_left_corner) {
		case 'W':case 'w':
			for (int k=1 ; k<=column ; k++) {
				if (k%2==0) {
					for (int i=1 ; i<=row ; i++) {
						if (i%2==0) {
							System.out.print("W ");
						}else {
							System.out.print("B ");
						}		
					}	
				}else {
					for (int i=1 ; i<=row ; i++) {
						if (i%2==0) {
							System.out.print("B ");
						}else {
							System.out.print("W ");
						}		
					}	
				}
				System.out.println("");
			}
		break;
		case 'B':case 'b':
			for (int k=1 ; k<=column ; k++) {
				if (k%2==0) {
					for (int i=1 ; i<=row ; i++) {
						if (i%2==0) {
							System.out.print("B ");
						}else {
							System.out.print("W ");
						}		
					}	
				}else {
					for (int i=1 ; i<=row ; i++) {
						if (i%2==0) {
							System.out.print("W ");
						}else {
							System.out.print("B ");
						}		
					}	
				}
				System.out.println("");
			}		
		break;
		}
		
	}

}
