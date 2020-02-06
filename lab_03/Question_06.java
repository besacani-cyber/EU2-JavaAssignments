package assignments.lab_03;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter minimum two characters of string: ");
		String str = input.next();		
		while (str.length()<2) {
			System.out.println("Please enter minimum two characters of string: ");
			str = input.next();
			input.close();
		}		
		System.out.println(withoutEnd(str));
	
	}
	
	public static String withoutEnd(String str) {
		
		str = str.substring(0,1) + str.substring(str.length()-1);
		return str;
	
	}

}