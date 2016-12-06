import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		//Task4. Write a program that tells you if a number is prime. - prosto chislo
		Scanner sc = new Scanner(System.in);
		//Input + check
		System.out.print("Please enter the number for prime check: ");
		int input = sc.nextInt();
		while (input < 0 ) {
			System.out.println("Invalid number. The input must be a positive number: ");
			System.out.print("Please enter the number for prime check: ");
			input = sc.nextInt();
		}
		//Prime check
		boolean isPrime = true;
		for (int i = 2; i < input; i++) {
			if ((double)input % i == 0) {
				isPrime = false;
				break;
			}
		}
		//Result
		if (isPrime) {
			System.out.print("The number is prime.");
		}
		else {
			System.out.println("The number is NOT prime.");
		}
	}
}
