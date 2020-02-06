package assignments.lab_03;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter minimum two characters of string: ");
		String str = input.next();		
		while (str.length()<2) {
			System.out.println("Please enter minimum two characters of string: ");
			str = input.next();
			input.close();
		}		
		System.out.println(extraEnd(str));
	
	}
	
	public static String extraEnd(String str) {
		
		str = str.substring(0,2);
		str = str + str + str;
		return str;
	
	}

}
