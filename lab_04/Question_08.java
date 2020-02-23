package assignments.lab_04;

import java.util.Arrays;

public class Question_08 {

	public static void main(String[] args) {

		int[] numbers1 = {1,2,3,4,5,6,7,8};	
		int[] numbers2 = {8,9,0};
		int[] numbers3 = {2};
	
		System.out.println("numbers1 = " + Arrays.toString(numbers1) + " --> " + (twoOrThree(numbers1)));	
		System.out.println("numbers2 = " + Arrays.toString(numbers2) + " --> " + (twoOrThree(numbers2)));	
		System.out.println("numbers3 = " + Arrays.toString(numbers3) + " --> " + (twoOrThree(numbers3)));	

	}
	
	public static boolean twoOrThree(int[] numbers) {
		for (int each : numbers) {
			if (each == 2 || each == 3){
				return true;
			}	
		}
		return false;

	}

}
