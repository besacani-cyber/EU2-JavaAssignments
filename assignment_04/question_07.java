package assignments.assignment_04;

import java.util.Scanner;

public class question_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the seconds please: ");
		int second = input.nextInt();
		input.close();
		int minute=0;
		int hour=0;
		int day=0;
				
		if (second/86400>=1) {
			day = second/86400;
			second = second-(day*86400);
		}if (second/3600>=1) {
			hour = second/3600;
			second = second-(hour*3600);
		}if(second/60>=1) {
			minute = second/60;
			second = second-(minute*60);
		}
		System.out.println(day+" day(s) "+hour+" hour(s) "+minute+" minute(s) "+second+" second(s)");		

	}

}