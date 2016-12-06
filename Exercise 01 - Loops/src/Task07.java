import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.print("Please enter A (1..32767): ");
		int inputA = sc.nextInt();
		while (inputA < 0 || inputA > 32767) {
			System.out.println("Invalid number.");
			System.out.print("Please enter A (1..32767): ");
			inputA = sc.nextInt();
		}
		System.out.print("Please enter B (1..7): ");
		int inputB = sc.nextInt();
		while (inputB < 0 || inputB > 7) {
			System.out.println("Invalid number.");
			System.out.print("Please enter B (1..7): ");
			inputB = sc.nextInt();
		}
		System.out.print("Please enter C (1..7): ");
		int inputC = sc.nextInt();
		while (inputC < 0 || inputC > 7) {
			System.out.println("Invalid number.");
			System.out.print("Please enter C (1..7): ");
			inputC = sc.nextInt();
		}
		//Result
		inputA = inputA ^ (1 << inputB);
		inputA = inputA ^ (1 << inputC);
		System.out.print("The new value of A is: " + inputA);
	}
}
