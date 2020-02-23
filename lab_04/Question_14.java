package assignments.lab_04;

import java.util.Arrays;

public class Question_14 {

	public static void main(String[] args) {
		
		int[] numbers1 = {1,2,3};
		int[] numbers2 = {4,5,6,7,8,9};
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + Arrays.toString(combine(numbers1,numbers2)));

	}
	
	public static int[] combine(int[] numbers1, int[] numbers2) {
		
		int[] numbers = {};
		numbers = new int[numbers1.length + numbers2.length];
		
		for (int i=0; i<=numbers1.length-1; i++) {
			numbers[i] = numbers1[i];
		}
		
		for (int i=numbers1.length; i<=numbers.length-1 ; i++) {
			for (int j=0 ; j<=numbers2.length-1 ; j++) {
				numbers[j+numbers1.length] = numbers2[j];
			}			
		}
		
		return numbers;
		
	}

}
