package assignments.lab_03;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the string: ");
		String str = input.nextLine();
		input.close();
		System.out.println(str + "-->" + frontAgain(str));
		
	}
	
	public static boolean frontAgain(String str) {
		
		if ((str.substring(0, 2)).equals(str.substring(str.length()-2))){
			return true;
		}else {
			return false;
		}
		
	}

}
