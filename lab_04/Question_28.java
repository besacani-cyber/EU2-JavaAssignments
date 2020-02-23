package assignments.lab_04;

import java.util.Arrays;
import java.util.Scanner;

public class Question_28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Plese enter the first number: ");
		int start = input.nextInt();
		System.out.print("Plese enter the last number: ");
		int end = input.nextInt();
		input.close();
		
		System.out.println("fizzArray(" + start + "," + end + ") --> " + Arrays.toString(fizzArray(start, end)));

	}
	
	public static int[] fizzArray(int start, int end) {
		
		int[] array = new int[end-start];
		for (int i=0 ; i<=end-start-1 ; i++) {
			array[i] = start+i;
		}
		return array;
			
	}

}
