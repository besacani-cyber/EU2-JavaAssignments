package assignments.lab_03;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first string");
		String firstString = input.nextLine();
		System.out.println("Plese enter the second string");
		String secondString = input.nextLine();
		input.close();
		System.out.println(makeAbba(firstString,secondString));
				
	}
	
	public static String makeAbba(String a, String b) {
		
		String c = a + b + b + a;		
		return c;
	}

}
