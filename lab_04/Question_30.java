package assignments.lab_04;

import java.util.Arrays;

public class Question_30 {

	public static void main(String[] args) {
		
		int[] numbers1 = {1,2,3,4,5,6}; 
		int[] numbers2 = {1,2,3,3,5,2}; 
		int[] numbers3 = {1,1,3,2,1,4,1,9}; 
		int[] numbers4 = {1,1,2,2,3}; 
		int[] numbers5 = {1,1,2,2,4,3,3}; 
		
		System.out.println("int [] numbers1 = " + Arrays.toString(numbers1) + " ==> " + Arrays.toString(notAlone(numbers1)));
		System.out.println("int [] numbers2 = " + Arrays.toString(numbers2) + " ==> " + Arrays.toString(notAlone(numbers2)));
		System.out.println("int [] numbers3 = " + Arrays.toString(numbers3) + " ==> " + Arrays.toString(notAlone(numbers3)));
		System.out.println("int [] numbers4 = " + Arrays.toString(numbers4) + " ==> " + Arrays.toString(notAlone(numbers4)));
		System.out.println("int [] numbers5 = " + Arrays.toString(numbers5) + " ==> " + Arrays.toString(notAlone(numbers5)));

	}
	
	public static int[] notAlone(int[] numbers) {
		
		for (int i=0; i<numbers.length ; i++) {
			
			if (i==0) {
				numbers[i] = numbers[i];
				
			}else if (i==numbers.length-1) {
				numbers[i] = numbers[i];
				
			}else if (i!=0 && i!=numbers.length-1 && numbers[i] != numbers[i-1] && numbers[i] != numbers[i+1]) {
				
				if (numbers[i] >= numbers[i-1] && numbers[i] >= numbers[i+1]){
					numbers[i] = numbers[i];
				}else if (numbers[i] >= numbers[i-1] && numbers[i] < numbers[i+1]) {
					numbers[i] = numbers[i+1];
				}else if (numbers[i] < numbers[i-1] && numbers[i] >= numbers[i+1]) {
					numbers[i] = numbers[i-1];
				}else if (numbers[i-1] >= numbers[i+1]) {
					numbers[i] = numbers[i-1];
				}else {
					numbers[i] = numbers[i+1];
				}
				
			}else if (i!=0 && i!=numbers.length-1 && (numbers[i] == numbers[i-1] || numbers[i] == numbers[i+1]) && i != 0 && i != numbers.length-1) {
				numbers[i] = numbers[i];
			}	
	
		}
		
		return numbers;

	}

}
