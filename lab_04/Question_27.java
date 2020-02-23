package assignments.lab_04;

import java.util.Arrays;

public class Question_27 {

public static void main(String[] args) {
		
		int[] numbers1 = {6,1,2,3,0,7,2};
		int[] numbers2 = {1,5,1,2,1};	
		int[] numbers3 = {2,4,13,7,8,9};	
		int[] numbers4 = {1,2,3,6,7,0,4,2};	
		int[] numbers5 = {1,3,5};
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " = > " + isIncreasingAdjacent3(numbers1));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + isIncreasingAdjacent3(numbers2));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " = > " + isIncreasingAdjacent3(numbers3));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " = > " + isIncreasingAdjacent3(numbers4));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " = > " + isIncreasingAdjacent3(numbers5));	

	}
	
	public static boolean isIncreasingAdjacent3(int[] numbers) {
		
		boolean flag = false;
		for (int i=0 ; i<=numbers.length-3 ; i++) {
			if (numbers[i+2]-numbers[i+1]==1 && numbers[i+1]-numbers[i]==1) {
				flag = true;
			}
		}
		return flag;
			
	}
	
}