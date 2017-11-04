import java.util.Scanner;

public class FindTripPractice {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		PaxInfoPractice PaxInfoPracticeObject = new PaxInfoPractice ();
		
		System.out.println("Enter Passenger First Name: ");
		String fName = input.nextLine();
		System.out.println("Enter Passenger Last Name: ");
		String lName = input.nextLine();
		System.out.println("Enter Record Locator: ");
		String rLocator = input.next();
		
		PaxInfoPracticeObject.tripDetails (fName, lName, rLocator);
	}

}
