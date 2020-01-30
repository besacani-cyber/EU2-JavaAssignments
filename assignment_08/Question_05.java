package assignments.assignment_08;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int num = input.nextInt();
		input.close();
		sign(num);

	}
	
	public static void sign(int i) {
		
		if (i>0) {
			System.out.println("1");
		}else if (i<0) {
			System.out.println("-1");
		}else {
			System.out.println("0");
		}
	
	}

}
