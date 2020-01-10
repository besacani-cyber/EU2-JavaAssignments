package assignments.assignment_03;

public class question07 {

	public static void main(String[] args) {
		
		int price_in_cents = 45;
		int changes = 100-price_in_cents;
		int quarters, dimes, nickles;
		quarters = changes/25;
		dimes = (changes%25)/10;
		nickles = (((changes%25)%10)/5);
		System.out.println("Your change is " + quarters  + " quarters, " + dimes + " dimes, and " + nickles + " nickles");	
		
	}

}
