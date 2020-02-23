package assignments.lab_04;

import java.util.Arrays;

public class Question_07 {

	public static void main(String[] args) {

		int[] numbers1 = {9,2,3,4,5,6,7,8,90};	
		int[] numbers2;
		numbers2 = new int[2];
		System.out.println("numbers1 = " + Arrays.toString(numbers1));
		System.out.println("numbers2 = " + Arrays.toString(fromFirst(numbers1,numbers2)));	

	}
	
	public static int[] fromFirst(int[] numbers1, int[] numbers2) {
		numbers2[0] = numbers1[0];
		numbers2[1] = numbers1[numbers1.length-1];
		return numbers2; 
	}

}
