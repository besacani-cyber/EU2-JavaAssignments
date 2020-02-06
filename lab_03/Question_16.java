package assignments.lab_03;

import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the text: ");
		String text = input.nextLine();
		input.close();
		System.out.println(atFirst(text));
		
	}
	
	public static String atFirst(String text) {
		
		String a = "";
		
		if (text.length()>=2) {
			a = text.substring(0,2);
		}else if (text.length()==1){
			a =  text.charAt(0) + "@";
		}else if (text.length()==0){
			a =  "@@";
		}
		
		return a;
	}

}