package assignments.lab_03;

import java.util.Scanner;

public class Question_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the text: ");
		String text = input.nextLine();
		input.close();
		System.out.println(polindrome(text));
		
	}
	
	public static String polindrome(String text) {
		
		String a = "";
		
		for (int i=1 ; i<=text.length() ; i++) {			
			a += text.charAt(text.length()-i);		
		}	
		return a;
					
	}

}