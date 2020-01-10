package assignments.assignment_03;

public class question06 {

	public static void main(String[] args) {

		int overdose = 10000;
		int coffeine_in_a_cola = 34;
		int coffeine_in_a_coffee = 160;
		
		System.out.println("Number of miligrams in drink: " + ((overdose/coffeine_in_a_cola)+1)*coffeine_in_a_cola);
		System.out.println("It would take about " + ((overdose/coffeine_in_a_cola)+1) + " drinks for a lethal overdose");
		
		System.out.println("Number of miligrams in drink: " + ((overdose/coffeine_in_a_coffee)+1)*coffeine_in_a_coffee );
		System.out.println("It would take about " + ((overdose/coffeine_in_a_coffee)+1) + " drinks for a lethal overdose");
		
				
	}

}
