package assignments.assignment_11;

//  The Utopian Tree grows exactly 1 cm for the first three years, 
//	and after that, it grows by 2 cm every year, this is a simple 
//	implementation of the algorithm. You will need to use loops 
//	to create it. Show 10 years of growth of the Utopian Tree.
//  Sample Output:
//     year 1 - growth 1 cm
//     tree size: 1cm
//     year 2 - growth 1 cm
//     tree size: 2cm
//     year 3 - growth 1 cm
//     tree size:3cm
//     year 4 - growth 2 cm
//     tree size: 5cm
//     year 5 - growth 2 cm
//     tree size: 7cm
//     year 6 - growth 2 cm
//     tree size: 9cm
//     ... until you reach year 10

public class Question_41 {
	
	public static void main(String[] args) {
		
		int treeSize = 0;
		int growth = 0;

		for (int i=0 ; i<10 ; i++) {
			if (i<3) {
				growth = 1;
				treeSize += growth;
			}else {
				growth = 2;
				treeSize += growth;
			}
			System.out.println("Year " + (i+1) + " - growth " + growth + " cm" );
			System.out.println("Tree Size : " + treeSize + " cm");
			
		}	
	
	}

}












