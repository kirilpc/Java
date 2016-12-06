import java.util.Scanner;

public class Task05 {

	public static void main(String[] atgs) {
		//Task5. Write a program that reads a positive number and writes its binary representation.
		Scanner sc = new Scanner(System.in); 
		//Input
		System.out.print("Please enter a positive number: ");
		int input = sc.nextInt();
		while (input < 1) {
			System.out.println("Invalid number.");
			System.out.print("Please enter a positive number: ");
			input = sc.nextInt();
		}
		//Result generation
		long result = 0;
		long decCount = 1;
		while (input > 0) {
			result += (input % 2)*decCount;
			input /=2;
			decCount *= 10;
		}
		System.out.println(result);
	}
}
