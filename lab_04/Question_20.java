package assignments.lab_04;

import java.util.Arrays;

public class Question_20 {

	public static void main(String[] args) {
		
		int[] numbers1 = {6,13,2,2,5,6,8,9};
		int[] numbers2 = {1,5,6,3,6,7,2};	
		int[] numbers3 = {2,2,13,7};	
		int[] numbers4 = {2,2};	
		int[] numbers5 = {2};	
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " = > " + check22(numbers1));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + check22(numbers2));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " = > " + check22(numbers3));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " = > " + check22(numbers4));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " = > " + check22(numbers5));	

	}
	
	public static boolean check22(int[] numbers) {
		
		for (int i=1 ; i<=numbers.length-1 ; i++) {			
			if (numbers[i]==2 && numbers[i-1]==2) {
				return true;
			}
		}
		return false;
	
	}
	
}