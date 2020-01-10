package assignments.assignment_04;

import java.util.Scanner;

public class question_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the medium that the sound will travel through");
		System.out.println("'air', 'water' or 'steel'");
		String medium = input.next();
		System.out.println("Please enter the distance that sound wave will travel: ");
		int distance = input.nextInt();
		input.close();
		double time=0;
		
		switch (medium) {
		case "air":
			time = (double)distance/1100;
			System.out.println("The sound takes " + distance + " feet in "+ time + " seconds in the air.");
			break;
		case "water":
			time = (double)distance/4900;
			System.out.println("The sound takes " + distance + " feet in "+ time + " seconds in the water.");
			break;
		case "steel":
			time = (double)distance/16400;
			System.out.println("The sound takes " + distance + " feet in "+ time + " seconds in the steel.");
			break;
		default:				
		
		}

	}

}
