package assignments.assignment_04;

import java.util.Scanner;

public class question_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year please:");
		int year = input.nextInt();
		input.close();
			
		if (year%4==0)  {
			if (year%100==0) {
				if (year%400==0) {
					System.out.println(year + " Leap Year");
				}else {
					System.out.println(year + " NOT a Leap Year");
				}
			}else {
				System.out.println(year + " Leap Year");
			}
		}else {
			System.out.println(year + " NOT a Leap Year");
		}	
		
	}

}
