package assignments.lab_04;

import java.util.Arrays;

public class Question_05 {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7,8};
		System.out.println("Numbers = " + Arrays.toString(numbers));
		System.out.println("Numbers rotated to left = " + Arrays.toString(rotateLeft(numbers)));
			
	}
	
	public static int[] rotateLeft(int[] numbers) {
		int zero = numbers[0];
		for (int i=0; i<numbers.length-1 ; i++) {			
			numbers[i] = numbers[i+1];
		}
		numbers[numbers.length-1] = zero;
		return numbers;	
	}
	
}