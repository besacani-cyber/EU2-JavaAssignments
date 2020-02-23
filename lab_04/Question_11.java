package assignments.lab_04;

import java.util.Arrays;

public class Question_11 {

	public static void main(String[] args) {

		int[] numbers1 = {1,6,3,7,8};	
		int[] numbers2 = {8,9,2,3,6};
		int[] numbers3 = {3};
	
		System.out.println("int [] numbers1 = " + Arrays.toString(numbers1) + " ==> " +Arrays.toString(twoThree(numbers1)));	
		System.out.println("int [] numbers2 = " + Arrays.toString(numbers2) + " ==> " +Arrays.toString(twoThree(numbers2)));
		System.out.println("int [] numbers3 = " + Arrays.toString(numbers3) + " ==> " +Arrays.toString(twoThree(numbers3)));

	}
	
	public static int[] twoThree(int[] numbers) {
		
		for (int i=0 ; i<numbers.length-1 ; i++) {
			if (numbers[i] == 2 && numbers[i+1] == 3) {
				numbers[i+1] = 0;
			}
		}
		return numbers;

	}

}