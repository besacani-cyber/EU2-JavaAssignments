package assignments.lab_01;

// Write a method that accepts a string and a non-negative number, 
// and prints a larger string that is number copies of the original String
// stringTimes("Hi", 2); = > HiHi
// stringTimes("Hi", 3); = > HiHiHi
// stringTimes("Hi", 1); = > Hi

public class Question_01 {

	public static void main(String[] args) {
		
		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);

	}
	
	public static void stringTimes(String word, int number) {
		
		System.out.print("stringTimes(\""+ word + "\"," + number + "); = > ");
		for (int i=1 ; i<=number ; i++) {
			System.out.print(word);
		}
		System.out.println();
		
	}

}
