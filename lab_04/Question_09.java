package assignments.lab_04;

import java.util.Arrays;

public class Question_09 {

	public static void main(String[] args) {

		int[] numbers1 = {1,6,7,8};	
		int[] numbers2 = {8,9,6};
		int[] numbers3 = {2};
	
		System.out.println("int [] numbers1 = " + Arrays.toString(numbers1) + Arrays.toString(doubleLength(numbers1)));	
		System.out.println("int [] numbers2 = " + Arrays.toString(numbers2) + Arrays.toString(doubleLength(numbers2)));
		System.out.println("int [] numbers3 = " + Arrays.toString(numbers3) + Arrays.toString(doubleLength(numbers3)));

	}
	
	public static int[] doubleLength(int[] numbers) {
		
		int [] numbersReturn;
		numbersReturn = new int[numbers.length*2];
		numbersReturn[numbersReturn.length-1] = numbers[numbers.length-1];
		return numbersReturn;

	}

}