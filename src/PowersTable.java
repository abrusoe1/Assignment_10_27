import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		String yn;
		
		System.out.println("Learn your squares and cubes!");
		
		while(true) {
		
		System.out.println();
		System.out.print("Enter an integer: ");
		int i = scnr.nextInt();
		
		System.out.println();
		System.out.print("Number     "); //These are all 11 characters including spaces
		System.out.print("Squared    ");
		System.out.print("Cubed      ");
		System.out.println();
		
		int j = 0;
		while (j < 3) {
			System.out.print("=======    ");
			j++;
		
		}
		
		System.out.println();
		
		for (int k = 0; k < i; k++) {
			int l = k + 1;
			String s1 = String.format("%-11d", l);  //The - left-justifies
			String s2 = String.format("%-11d", l * l);
			String s3 = String.format("%-11d", l * l * l);
			System.out.print(s1);
			System.out.print(s2);
			System.out.print(s3);;
			System.out.println();
		}
		
		while(true) {
		
		System.out.println();	
		System.out.print("Continue? (Y/N): ");
		yn = scnr.next();
		
			if (yn.equalsIgnoreCase("Y") || yn.equalsIgnoreCase("N")) {
				break;
			} else {
				System.out.println();
				System.out.println("Enter Y or N this time.");
			}
		}
		
		if (yn.equalsIgnoreCase("N")) {
			System.out.println();
			System.out.println("Bye!");
			scnr.close();
			break;
//		} else if(!yn.equalsIgnoreCase("Y")) { //This was before I figured out how to make the program ask again if something aside from case-insensitive y/n was put in
//			System.out.println();
//			System.out.println("I'm taking that as a no.");
//			System.out.println();
//			System.out.println("Bye!");
//			scnr.close();
//			break;

		
		
//		if (yn.equalsIgnoreCase("Y")) {  //This repeated the line "Learn your squares and cubes!"
//			System.out.println();
//			main(null);
//		} else {
//			scnr.close();
//			System.out.println();
//			System.out.println("Bye!");
//		}
			}
		}
	}
}
// Use a for loop when making the loop for the table
// Remember that continue; skips to the end of the loop then repeats, break; completely breaks out of the loop
