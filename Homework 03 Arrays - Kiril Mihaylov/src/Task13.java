import java.util.Scanner;

public class Task13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a positive number: ");
		int input = sc.nextInt();
		while (input < 0) {
			System.out.println("Invalid input.");
			System.out.print("Please enter a positive number: ");
			input = sc.nextInt();
		}
		
		int[] binaryArr = new int[32];
		byte lastDigit = 0;
		while (input > 0) {
			binaryArr[lastDigit] = input % 2;
			input /= 2;
			lastDigit++;
		}
		for (int i = lastDigit-1; i >= 0; i--) {
			System.out.print(binaryArr[i]);
		}
	}
}