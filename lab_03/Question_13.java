package assignments.lab_03;

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the text: ");
		String text = input.nextLine();
		input.close();
		System.out.println(doubleChar(text));
		
	}
	
	public static String doubleChar(String text) {
		
		String newText = "";
		for (int i=0 ; i<text.length() ; i++) {
			char Char = text.charAt(i);
			newText = newText + Char + Char;
		}
		return newText;	
		
	}

}