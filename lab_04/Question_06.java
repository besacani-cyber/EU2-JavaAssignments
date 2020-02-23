package assignments.lab_04;

import java.util.Arrays;

public class Question_06 {

	public static void main(String[] args) {
		
		int [] numbers = {1,20,3,4,12,6,7,8};
		System.out.println("Numbers = " + Arrays.toString(numbers));
		System.out.println("New Numbers = " + Arrays.toString(setAll(numbers)));
			
	}
	
	public static int[] setAll(int[] numbers) {
		int max = 0;
		for (int each : numbers) {
			if (each>max) {
				max = each;
			}
		}
		for (int i=0 ; i<numbers.length ; i++) {
			numbers[i] = max;
		}
		return numbers;

	}
	
}