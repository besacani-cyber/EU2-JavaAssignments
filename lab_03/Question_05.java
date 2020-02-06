package assignments.lab_03;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String str = input.next();	
		input.close();
		System.out.println(firstHalf(str));

	}
	
	public static String firstHalf(String str) {
		
		str = str.substring(0,(str.length()/2));
		return str;
	
	}

}