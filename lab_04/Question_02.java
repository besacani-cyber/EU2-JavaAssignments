package assignments.lab_04;

import java.util.Arrays;

public class Question_02 {

	public static void main(String[] args) {
		
		int[] numbers1 = {6,2,3,4,5,6};
		int[] numbers2 = {6,5,4,3,2,1};	
		int[] numbers3 = {3,4,5,3};	
		int[] numbers4 = {8,8};	
		int[] numbers5 = {5};	
		
		if (checkLength(numbers1)) {
			checkEquality(numbers1);
			System.out.println("int[] numbers = " + Arrays.toString(numbers1) + " ==> " + checkEquality(numbers1));
		}else {
			System.out.println("int[] numbers = " + Arrays.toString(numbers1) + " ==> " + "not a valid array");
		}
		
		if (checkLength(numbers2)) {
			checkEquality(numbers2);
			System.out.println("int[] numbers = " + Arrays.toString(numbers2) + " ==> " + checkEquality(numbers2));
		}else {
			System.out.println("int[] numbers = " + Arrays.toString(numbers2) + " ==> " + "not a valid array");
		}
		
		if (checkLength(numbers3)) {
			checkEquality(numbers3);
			System.out.println("int[] numbers = " + Arrays.toString(numbers3) + " ==> " + checkEquality(numbers3));
		}else {
			System.out.println("int[] numbers = " + Arrays.toString(numbers3) + " ==> " + "not a valid array");
		}
		
		if (checkLength(numbers4)) {
			checkEquality(numbers4);
			System.out.println("int[] numbers = " + Arrays.toString(numbers4) + " ==> " + checkEquality(numbers4));
		}else {
			System.out.println("int[] numbers = " + Arrays.toString(numbers4) + " ==> " + "not a valid array");
		}
		
		if (checkLength(numbers5)) {
			checkEquality(numbers5);
			System.out.println("int[] numbers = " + Arrays.toString(numbers5) + " ==> " + checkEquality(numbers5));
		}else {
			System.out.println("int[] numbers = " + Arrays.toString(numbers5) + " ==> " + "not a valid array");
		}

	}
	
	public static boolean checkLength(int[] numbers) {
		if (numbers.length>1) {
			return true;
		}else {
			return false;
		}	
	}
	
	public static boolean checkEquality(int[] numbers) {
		if (numbers[0]==numbers[numbers.length-1]) {
			return true;
		}else {
			return false;
		}
	}
	
	
}