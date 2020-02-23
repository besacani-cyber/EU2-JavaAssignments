package assignments.lab_04;

import java.util.Arrays;
import java.util.Scanner;

public class Question_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the array length : ");
		int length = input.nextInt();
		input.close();
		
		System.out.println("fizzArray(" + length + ") --> " + Arrays.toString(fizzArray(length)));

	}
	
	public static int[] fizzArray(int length){
		
		int [] lengthArray = new int[length];
		for (int i=0 ; i<length ; i++) {
			lengthArray[i]=i;
		}	
		return lengthArray;
		
	}

}
