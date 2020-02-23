package assignments.lab_04;

import java.util.Arrays;

public class Question_03 {

	public static void main(String[] args) {
		
		int[] numbers1 = {0,2,3,4};
		int[] numbers2 = {1,1,1};
		
		System.out.println("int[] numbers = " + Arrays.toString(numbers1) + " ==> " + checkLength(numbers1,numbers2));
		System.out.println("int[] numbers = " + Arrays.toString(numbers2));
	
	} 
	
	public static String checkLength(int[] numbers1, int[] numbers2) {
		if (numbers1.length>1 && numbers2.length>1 && (numbers1[0]==numbers2[0] || numbers1[numbers1.length-1]==numbers2[numbers2.length-1])) {
			return "True";		
		}else if (numbers1.length<=1) {		
			return "Array1 is not valid";
		}else if (numbers2.length<=1) {
			return "Array2 is not valid";
		}else {
			return "False";
		}
			
	}
	
}
