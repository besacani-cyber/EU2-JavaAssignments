package assignments.lab_04;

import java.util.Arrays;

public class Question_17 {

	public static void main(String[] args) {
		
		int[] numbers1 = {6,2,3,4,5,6};
		int[] numbers2 = {6,5,4,3,2,1};	
		int[] numbers3 = {3,4,5,3};	
		int[] numbers4 = {8,8};	
		int[] numbers5 = {0};	
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " = > " + differenceMinAndMax(numbers1));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + differenceMinAndMax(numbers2));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " = > " + differenceMinAndMax(numbers3));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " = > " + differenceMinAndMax(numbers4));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " = > " + differenceMinAndMax(numbers5));	

	}
	
	public static int differenceMinAndMax(int[] numbers) {
		int max = 0, min = 1000;
		for (int each : numbers) {
			if (each>max) {
				max = each;
			}
			if (each<min) {
				min = each;
			}
		}
		return max-min;
	
	}
	
}