package assignments.lab_04;

import java.util.Arrays;

public class Question_26 {

public static void main(String[] args) {
		
		int[] numbers1 = {6,1,1,2,1,0,0};
		int[] numbers2 = {1,5,1,2,1};	
		int[] numbers3 = {2,4,13,7};	
		int[] numbers4 = {1,4,5,6,7,0,2,4};	
		int[] numbers5 = {1,3,5};
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " = > " + is3OddOr3Even(numbers1));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " = > " + is3OddOr3Even(numbers2));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " = > " + is3OddOr3Even(numbers3));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " = > " + is3OddOr3Even(numbers4));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " = > " + is3OddOr3Even(numbers5));	

	}
	
	public static boolean is3OddOr3Even(int[] numbers) {
		
		int oddCounter = 0, evenCounter =0;
		for (int i=0 ; i<=numbers.length-3 ; i++) {
			if (numbers[i]%2==1 && numbers[i+1]%2==1 && numbers[i+2]%2==1) {
				oddCounter++;
			}
			if (numbers[i]%2==0 && numbers[i+1]%2==0 && numbers[i+2]%2==0) {
				evenCounter++;
			}
		}
		if (oddCounter >=1 || evenCounter >=1) {
			return true;
		}else {
			return false;
		}
			
	}
	
}