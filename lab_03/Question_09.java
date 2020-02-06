package assignments.lab_03;

import java.util.Scanner;

public class Question_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter minimum two characters of string: ");
		String str = input.next();		
		while (str.length()<2) {
			System.out.println("Please enter minimum two characters of string: ");
			str = input.next();
			input.close();
		}		
		System.out.println(right2(str));
	
	}
	
	public static String right2(String str) {
		
		str = str.substring(str.length()-2) + str.substring(0,(str.length()-2));
		return str;
	
	}

}