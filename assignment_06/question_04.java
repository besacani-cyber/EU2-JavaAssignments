package assignments.assignment_06;

import java.util.Scanner;

public class question_04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the upper bound: ");
		int upper_bound=input.nextInt();
		input.close();
		int total=0;
		int i=0;
		
		while (i<=upper_bound) {
			total=total+i;
			i++;
		}
		System.out.println("Total:" + total);
	}

}
