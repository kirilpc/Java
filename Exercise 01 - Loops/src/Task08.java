import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		//Task8. Write a program that reads a number and prints a triangle of stars with the height of 
		// the number.
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.print("Please enter the size of the triangle: ");
		int input = sc.nextInt();
		while (input < 1) {
			System.out.println("The number must be positive.");
			System.out.print("Please enter the size of the triangle: ");
			input = sc.nextInt();
		}
		//Triangle generation
		for (int i = 0; i < input; i++) {
			for (int j = input -1 -i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i*2 + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
