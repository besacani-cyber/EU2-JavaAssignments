package assignments.lab_04;

import java.util.Arrays;

public class Question_01 {

	public static void main(String[] args) {
		
		int[] numbers1 = {1,2,3,4,5,6};
		int[] numbers2 = {6,5,4,3,2,1};	
		int[] numbers3 = {3,4,5,2};	
		int[] numbers4 = {6};	
		int[] numbers5 = {};	
		
		System.out.println("int[] numbers = " + Arrays.toString(numbers1) + " ==> " + isFirstOrLastSix(numbers1));
		System.out.println("int[] numbers = " + Arrays.toString(numbers2) + " ==> " + isFirstOrLastSix(numbers2));
		System.out.println("int[] numbers = " + Arrays.toString(numbers3) + " ==> " + isFirstOrLastSix(numbers3));
		System.out.println("int[] numbers = " + Arrays.toString(numbers4) + " ==> " + isFirstOrLastSix(numbers4));
		System.out.println("int[] numbers = " + Arrays.toString(numbers5) + " ==> " + isFirstOrLastSix(numbers5));

	}
	
	public static boolean isFirstOrLastSix(int [] numbers) {
		if (numbers.length<1) {
			return false;
		}
		if (numbers[0]==6 || numbers[numbers.length-1]==6) {
			return true;
		}else {
			return false;
		}
		
	}

}
