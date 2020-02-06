package assignments.lab_03;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the text: ");
		String text = input.nextLine();
		input.close();
		System.out.println(endsLy(text));
		
	}
	
	public static boolean endsLy(String text) {
		
		if (text.endsWith("ly")) {
			return true;
		}else {
			return false;
		}
		
	}

}