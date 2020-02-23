package assignments.lab_04;

import java.util.Arrays;

public class Question_10 {

	public static void main(String[] args) {

		int[] numbers1 = {1,6,6,7,8};	
		int[] numbers2 = {8,9,3,3,6};
		int[] numbers3 = {2,2};
	
		System.out.println("int [] numbers1 = " + Arrays.toString(numbers1) + " --> " + twoOrThreeTwice(numbers1));	
		System.out.println("int [] numbers2 = " + Arrays.toString(numbers2) + " --> " + twoOrThreeTwice(numbers2));
		System.out.println("int [] numbers3 = " + Arrays.toString(numbers3) + " --> " + twoOrThreeTwice(numbers3));

	}
	
	public static boolean twoOrThreeTwice(int[] numbers) {
		
		int counter2 = 0; int counter3 = 0;
		for (int each : numbers) {
			if (each == 2) {
				counter2++;
			}
			if (each == 3) {
				counter3++;
			}		
		}
		if (counter2 == 2 || counter3 == 2) {
			return true;
		}
		return false;

	}

}