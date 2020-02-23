package assignments.lab_04;

import java.util.Arrays;

public class Question_12 {

	public static void main(String[] args) {

		int[] numbers1 = {1,6,6,7,8};	
		int[] numbers2 = {0,1,2,3,6};
	
		System.out.println("int [] numbers1 = " + Arrays.toString(numbers1));	
		System.out.println("int [] numbers1 = " + Arrays.toString(numbers2));
		System.out.println("Output: " + howmanyOne(numbers1,numbers2));	
		
	}
	
	public static int howmanyOne(int[] numbers1, int[] numbers2) {
		
		int counter = 0;
		if (numbers1[0] == 1) {
			counter++;
		}
		if (numbers2[0] == 1) {
			counter++;
		}
		return counter;

	}

}
