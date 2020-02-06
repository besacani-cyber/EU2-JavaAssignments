package assignments.lab_03;

import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the text: ");
		String text = input.nextLine();
		input.close();
		System.out.println(hasBad(text));
		
	}
	
	public static boolean hasBad(String text) {
		
		if (text.length()>3) {
			if (text.substring(0,3).equals("bad") || text.substring(1,4).contentEquals("bad")) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}

	}

}