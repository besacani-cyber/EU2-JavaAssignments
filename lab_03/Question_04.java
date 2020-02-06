package assignments.lab_03;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String str = input.next();	
		input.close();
		System.out.println(firstTwo(str));

	}
	
	public static String firstTwo(String str) {
		
		if (str.length()>=2) {
			str = str.substring(0,2);
		}	
		return str;
	
	}

}