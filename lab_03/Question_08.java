package assignments.lab_03;

import java.util.Scanner;

public class Question_08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter minimum two characters of string: ");
		String str = input.next();		
		while (str.length()<2) {
			System.out.println("Please enter minimum two characters of string: ");
			str = input.next();
			input.close();
		}		
		System.out.println(left2(str));
	
	}
	
	public static String left2(String str) {
		
		str = str.substring(2) + str.substring(0,2);
		return str;
	
	}

}