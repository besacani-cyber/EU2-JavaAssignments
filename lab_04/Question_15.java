package assignments.lab_04;

import java.util.Arrays;

public class Question_15 {

	public static void main(String[] args) {
		
		int[] numbers1 = {6,2,3,4,5,0};
		int[] numbers2 = {6,5,4,3,2,1};	
		int[] numbers3 = {3,4,5,99};	
		int[] numbers4 = {8,7};	
		int[] numbers5 = {0};	
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " = > " + Arrays.toString(swap(numbers1)));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + Arrays.toString(swap(numbers2)));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " = > " + Arrays.toString(swap(numbers3)));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " = > " + Arrays.toString(swap(numbers4)));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " = > " + Arrays.toString(swap(numbers5)));	

	}
	
	public static int[] swap(int[] numbers) {
		int temp = numbers[0];
		numbers[0] = numbers[numbers.length-1];
		numbers[numbers.length-1] = temp;
		return numbers;
	
	}
	
}