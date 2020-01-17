package assignments.assignment_06;

import java.util.Scanner;

public class question_02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int number=input.nextInt();
		input.close();
		int a=0;
		int b=1;
		int c=0;
		
		System.out.print(c);
		for (int i=0 ; i<=number ; i++) {
			System.out.print("," + c);
			c=a+b;
			a=b;
			b=c;
			
		}

	}

}
