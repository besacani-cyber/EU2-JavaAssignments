package assignments.assignment_08;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the buy price: ");
		int num1 = input.nextInt();
		System.out.print("Please enter the sell price: ");
		int num2 = input.nextInt();
		input.close();
		System.out.println("cProfits(" + num1 + "," + num2 + ") --> " + cProfits(num1,num2));

	}
	
	public static String cProfits(int buyPrice, int sellPrice) {
		if (buyPrice>sellPrice) {
			return "loss";
		}else if (buyPrice<sellPrice){
			return "profit";
		}else {
			return "no loss";
		}
	}

}