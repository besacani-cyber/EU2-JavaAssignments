package assignments.lab_03;

import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the text: ");
		String text = input.nextLine();
		input.close();
		System.out.println(catDog(text));
		
	}
	
	public static boolean catDog(String text) {
		
		int a = 0, b = 0, cat = 0, dog = 0;
		
		//finds the number of the cats in the given text
		String textCat = text;
		while (b != -1) {
			textCat = textCat.substring(a, textCat.length());
			a = 0;
			b = textCat.indexOf("cat", a);
			if (b == -1) {
				break;
			}else {
				a = b + 3;
				cat++;
			}
		}
		System.out.println("There are " + cat + " cat(s) int the given text");
		
		//finds the number of the dogs in the given text
		a = 0;
		b = 0;
		String textDog = text;
		while (b != -1) {
			textDog = textDog.substring(a, textDog.length());
			a = 0;
			b = textDog.indexOf("dog", a);
			if (b == -1) {
				break;
			}else {
				a = b + 3;
				dog++;
			}
		}		
		System.out.println("There are " + dog + " dog(s) int the given text");
		
		// compares the results and return boolean
		if (cat == dog) {
			return true;
		}else {
			return false;
		}
		
	}

}