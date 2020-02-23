package assignments.lab_04;

import java.util.Arrays;

public class Question_19 {

	public static void main(String[] args) {
		
		int[] numbers1 = {6,13,6,7,5,6,8,7,2};
		int[] numbers2 = {1,5,6,3,6,7,1};	
		int[] numbers3 = {3,6,13,7};	
		int[] numbers4 = {6,7};	
		int[] numbers5 = {13};	
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " = > " + totalBut67(numbers1));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + totalBut67(numbers2));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " = > " + totalBut67(numbers3));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " = > " + totalBut67(numbers4));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " = > " + totalBut67(numbers5));	

	}
	
	public static int totalBut67(int[] numbers) {
		
		boolean check6 = false;
		int sum = 0;
		for (int i=0 ; i<=numbers.length-1 ; i++) {			
			if (numbers[i] == 6 || check6) {
				check6 = true;
				if (numbers[i] == 7){
					check6 = false;
				}
			}else {
				sum += numbers[i];
			}

		}		
		return sum;
	
	}
	
}