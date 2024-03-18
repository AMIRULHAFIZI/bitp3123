import java.util.Scanner;
public class Lab2_3 {

	public static void main(String[] args) 
	{
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("How many marks do you want to insert? ");
		int numMarks = inputScanner.nextInt();
		
		double totalMarks = 0.0;
		for (int i=1; i <= numMarks; i++) {
			System.out.println("Please enter mark no " + i + ": ");
			double mark = inputScanner.nextDouble();
			System.out.println("Mark: " + mark + " has been inserted");
			totalMarks += mark;
		}
		
		System.out.println("Total mark is: " + totalMarks);
		System.out.println("Press any key to continue ...");
		inputScanner.next(); //wait for user to press any key
		
		inputScanner.close();
	}

}
