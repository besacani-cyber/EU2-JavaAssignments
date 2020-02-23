package assignments.lab_04;

import java.util.Arrays;

public class Question_22 {

	public static void main(String[] args) {
		
		int[] numbers1 = {6,13,1,2,1,6,4,2,1,4};
		int[] numbers2 = {4,5,1,2,6,7,2,4,2};	
		int[] numbers3 = {2,4,13,7};	
		int[] numbers4 = {1,4};	
		int[] numbers5 = {1};	
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " = > " + OnesVsFours(numbers1));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + OnesVsFours(numbers2));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " = > " + OnesVsFours(numbers3));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " = > " + OnesVsFours(numbers4));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " = > " + OnesVsFours(numbers5));	

	}
	
	public static boolean OnesVsFours(int[] numbers) {
		
		int sum1 = 0, sum4 = 0;
		for (int each : numbers) {
			if (each == 1) {
				sum1++;
			}		
			if (each == 4) {
				sum4++;
			}
		}
		if (sum1>sum4) {
			return true;
		}else {
			return false;
		}

	}
	
}