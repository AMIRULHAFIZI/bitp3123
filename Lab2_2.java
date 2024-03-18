import java.io.*;
import java.util.Scanner;
public class Lab2_2 {

	public static void main(String[] args) 
	{
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		double firstNumber = inputScanner.nextDouble();
		
		System.out.println("Enter the second number: ");
		double secondNumber = inputScanner.nextDouble();
		
		double sum = firstNumber + secondNumber;
		System.out.println("Sum of the entered numbers: " + sum);
		
		inputScanner.close();
	}
	

}
