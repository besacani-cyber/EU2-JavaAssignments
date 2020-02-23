package assignments.lab_04;

import java.util.Arrays;

public class Question_25 {

public static void main(String[] args) {
		
		int[] numbers1 = {6,1,1,2,1,1};
		int[] numbers2 = {1,2,5,4,6,1};	
	
		System.out.println("int[] numbers1 = " + Arrays.toString(numbers1));
		System.out.println("int[] numbers2 = " + Arrays.toString(numbers2));
		System.out.println("Output : " + difference(numbers1, numbers2)); 

	}
	
	public static int difference(int[] numbers1, int []numbers2) {
		
		int difference = 0;	
			for (int i=0 ; i<=numbers1.length-1 ; i++) {
				if (Math.abs(numbers1[i]-numbers2[i])<=2 && Math.abs(numbers1[i]-numbers2[i])!=0) {
					difference++;
				}					
			}		
		return difference;
			
	}
	
}