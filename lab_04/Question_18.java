package assignments.lab_04;

import java.util.Arrays;

public class Question_18 {

	public static void main(String[] args) {
		
		int[] numbers1 = {6,13,3,4,5,6};
		int[] numbers2 = {6,5,4,3,2,1};	
		int[] numbers3 = {3,4,13,3};	
		int[] numbers4 = {13,8};	
		int[] numbers5 = {13};	
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " = > " + unlucky13(numbers1));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + unlucky13(numbers2));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " = > " + unlucky13(numbers3));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " = > " + unlucky13(numbers4));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " = > " + unlucky13(numbers5));	

	}
	
	public static int unlucky13(int[] numbers) {
		
		int sum = 0;
		for (int i=0 ; i<=numbers.length-1 ; i++) {
			if (i==0) {
				if (numbers[i] != 13) {
					sum += numbers[i];
				}
			}else {
				if (numbers[i] != 13 && numbers[i-1] != 13) {
					sum += numbers[i];
				}
			}
		}
		return sum;
	
	}
	
}