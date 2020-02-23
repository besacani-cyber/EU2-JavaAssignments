package assignments.lab_04;

import java.util.Arrays;
import java.util.Scanner;

public class Question_24 {

public static void main(String[] args) {
		
		int[] numbers1 = {6,1,1,2,1,0,0};
		int[] numbers2 = {1,5,1,2,1};	
		int[] numbers3 = {2,4,13,7};	
		int[] numbers4 = {1,4};	
		int[] numbers5 = {1};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number : ");
		int number = input.nextInt();
		input.close();
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " / number = " + number + " = > " + isEverywhere(numbers1, number));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " / number = " + number + " = > " + isEverywhere(numbers2, number));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " / number = " + number + " = > " + isEverywhere(numbers3, number));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " / number = " + number + " = > " + isEverywhere(numbers4, number));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " / number = " + number + " = > " + isEverywhere(numbers5, number));	

	}
	
	public static boolean isEverywhere(int[] numbers, int number) {
		
		int trueCounter = 0;
		for (int i=0 ; i<=numbers.length-2 ; i++) {
			if (numbers[i]==number || numbers[i+1]==number) {
				trueCounter++;
			}
		}
		if (trueCounter == numbers.length-1) {
			return true;
		}else {
			return false;
		}
			
	}
	
}