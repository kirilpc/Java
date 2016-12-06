import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		//Task6. Write a program that reads a short positive number and tells how many bits are 1 in it.
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.print("Please enter a positive number from 1 to 32767: ");
		int input = sc.nextInt();
		while (input < 0 || input > 32767) {
			System.out.println("Invalid number.");
			System.out.print("Please enter a positive number from 1 to 32767: ");
			input = sc.nextInt();
		}
		//Result calculation
		int onesCount = 0;
		while (input > 0) {
			if (input % 2 == 1) {
				onesCount++;
			}
			input /= 2;
		}
		System.out.print("There are " + onesCount + " ones in the binary representation of the number. ");
	}
}
