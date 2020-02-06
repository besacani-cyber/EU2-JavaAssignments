package assignments.lab_03;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the name: ");
		String name = input.nextLine();
		input.close();
		helloName(name);
		
	}
	
	public static void helloName(String name) {
		
		System.out.println("Hello " + name);
		
	}

}
