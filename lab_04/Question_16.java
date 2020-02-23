package assignments.lab_04;

import java.util.Arrays;

public class Question_16 {

	public static void main(String[] args) {
		
		int[] numbers1 = {6,2,3,4,5,6};
		int[] numbers2 = {6,5,4,3,2,1};	
		int[] numbers3 = {3,4,5,3};	
		int[] numbers4 = {8,8};	
		int[] numbers5 = {0};	
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " = > " + checkEven(numbers1));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + checkEven(numbers2));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " = > " + checkEven(numbers3));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " = > " + checkEven(numbers4));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " = > " + checkEven(numbers5));	

	}
	
	public static int checkEven(int[] numbers) {
		int counter = 0;
		for (int each : numbers) {
			if (each%2==0) {
				counter++;
			}
		}
		return counter;
	
	}
	
}