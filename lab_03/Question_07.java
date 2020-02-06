package assignments.lab_03;

import java.util.Scanner;

public class Question_07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first string");
		String firstString = input.nextLine();
		System.out.println("Plese enter the second string");
		String secondString = input.nextLine();
		input.close();
		System.out.println(comboString(firstString,secondString));
				
	}
	
	public static String comboString(String a, String b) {
		
		String c = "";
		if (a.length()>b.length()) {
			c = b + a + b;
		} else if (a.length()<b.length()){
			c = a + b + a;
		} else {
			System.out.println("Strings lengths are equal!");
		}
		return c;

	}

}
