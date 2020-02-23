package assignments.lab_04;

import java.util.Arrays;

public class Question_13 {

	public static void main(String[] args) {

		int[] numbers1 = {9,2,6};	
		int[] numbers2 = {3,4,10};
	
		System.out.println("int [] numbers1 = " + Arrays.toString(numbers1) + " int [] numbers2 = " + Arrays.toString(numbers2) + " ==> " + biggestArray(numbers1, numbers2));	
		
	}
	
	public static String biggestArray(int[] numbers1, int[] numbers2) {
		
		int sum1 = 0 , sum2 = 0;
		for (int each : numbers1) {
			sum1 += each;
		}
		for (int each : numbers2) {
			sum2 += each;
		}
		if (sum1>sum2) {
			return Arrays.toString(numbers1);
		}else if (sum1<sum2) {
			return Arrays.toString(numbers2);
		}else {
			return "equal";
		}

	}

}