package assignments.assignment_03;

public class question05 {

	public static void main(String[] args) {

		int seconds = 3695;
		int hours, minutes;
		hours = seconds/3600;
		minutes = (seconds%3600)/60;
		seconds = ((seconds%3600)%60);
		System.out.println(hours + " hours," + minutes + "minutes, and " + seconds + " seconds");	

	}

}
