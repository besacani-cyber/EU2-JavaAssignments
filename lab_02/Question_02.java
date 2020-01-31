package assignments.lab_02;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		
/* A bag of cookies holds 40 cookies. The calorie information on the bag 
 * claims that there are 10 serving in the bag and that a serving equals 
 * 300 calories. This program lets the user enter the number of cookies he 
 * or she actually ate and then reports the number of total calories consumed.
 */
		
		int serving = 10;
		int cookies = 40;
		int calory = 300;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of cookies you ate please: ");
		int eaten = input.nextInt();
		input.close();
		
		int consumed = eaten * ((serving*calory)/cookies);
		System.out.println("Consumed Calory: " + consumed);

	}

}
