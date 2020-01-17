package assignments.assignment_06;

import java.util.Scanner;

public class question_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the upper bound: ");
		int end=input.nextInt();
		input.close();
		int i=0;
		
		while (i<=end) {
			if (i%2!=0) {
				if (i==1) {
					System.out.print(i);
				}else{
					System.out.print("," + i);
				}
			}
			i++;	
		}

	}

}
