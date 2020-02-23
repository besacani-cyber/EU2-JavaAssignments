package assignments.lab_04;

import java.util.Arrays;

public class Question_21 {

	public static void main(String[] args) {
		
		int[] numbers1 = {6,13,2,2,5,6,8,2,9,2};
		int[] numbers2 = {2,5,1,2,6,7,2,4,2};	
		int[] numbers3 = {2,2,13,7};	
		int[] numbers4 = {2,2};	
		int[] numbers5 = {2};	
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " = > " + is2s8(numbers1));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + is2s8(numbers2));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " = > " + is2s8(numbers3));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " = > " + is2s8(numbers4));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " = > " + is2s8(numbers5));	

	}
	
	public static boolean is2s8(int[] numbers) {
		
		int sum = 0;
		for (int each : numbers) {
			if (each == 2) {
				sum += each;
			}
		}
		if (sum == 8) {
			return true;
		}else {
			return false;
		}
	
	}
	
}