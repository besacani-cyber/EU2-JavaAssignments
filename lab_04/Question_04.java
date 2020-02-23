package assignments.lab_04;

import java.util.Arrays;

public class Question_04 {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7,8};
		System.out.println("Numbers = " + Arrays.toString(numbers));
		System.out.println("Total of the numbers = " + sumOfTheElements(numbers));
			
	}
	
	public static int sumOfTheElements(int[] numbers) {
		int sum = 0;
		for (int each : numbers) {
			sum += each;
		}
		return sum;	
	}
	

}
