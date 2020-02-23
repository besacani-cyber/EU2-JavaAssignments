package assignments.lab_04;

import java.util.Arrays;

public class Question_29 {

	public static void main(String[] args) {
		
		int[] numbers1 = {1,2,3,10,0,2,20,0,1};
		int[] numbers2 = {10,5,1,20,1};	
		int[] numbers3 = {1,4,130,7,6,50,4};	
		int[] numbers4 = {10,4};	
		int[] numbers5 = {0};
		
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1) + " ==> " + Arrays.toString(run10(numbers1)));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2) + " ==> " + Arrays.toString(run10(numbers2)));
		System.out.println("int[] numbers3 = " + Arrays.toString(numbers3) + " ==> " + Arrays.toString(run10(numbers3)));
		System.out.println("int[] numbers4 = " + Arrays.toString(numbers4) + " ==> " + Arrays.toString(run10(numbers4)));
		System.out.println("int[] numbers5 = " + Arrays.toString(numbers5) + " ==> " + Arrays.toString(run10(numbers5)));	

	}
	
	public static int[] run10(int[] numbers){
		
		int ten = 0;
		boolean flag = false;
		
		for (int i=0 ; i<=numbers.length-1 ; i++) {				
			if (numbers[i]%10==0) {
				if (numbers[i]==0 && flag) {
					numbers[i] = ten;
				} else {
					numbers[i] = numbers[i];
					ten = numbers[i];
					flag = true;
				}
			} else {
				if (flag){
					numbers[i] = ten;
				}else {
					numbers[i] = numbers[i];
				}
			}		
		}	
		return numbers;
		
	}

}
