package assignments.lab_01;

// We'll say a number is special if it is a multiple of 11 or if it is 
// one more than a multiple of 11. Write a method that accepts a number 
// and prints true if the given number is special.
// specialEleven(22) → true
// specialEleven(23) → true
// specialEleven(24) → false

public class Question_03 {

	public static void main(String[] args) {
		
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);

	}
	
	public static void specialEleven(int number) {
		
		System.out.print("specialEleven(" + number + ") -> ");
		if (number%11 == 0 || (number-1)%11 == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
