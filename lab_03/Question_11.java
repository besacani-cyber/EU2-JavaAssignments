package assignments.lab_03;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the whole text: ");
		String text = input.nextLine();
		System.out.print("Please enter the string to be counted in the text: ");
		String str = input.nextLine();
		input.close();
		System.out.println(str + " in the " + text + " --> " + countHi(text, str));
		
	}
	
	public static int countHi(String text, String str) {
		
		int a = 0, b = 0, counter = 0;
		
		while (b != -1) {
			text = text.substring(a, text.length());
			a = 0;
			b = text.indexOf(str, a);
			if (b == -1) {
				break;
			}else {
				a = b + str.length();
				counter++;
			}
		}
		return counter;
		
	}

}