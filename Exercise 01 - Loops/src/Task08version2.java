import java.util.Scanner;

public class Task08version2 {

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
		int spaces = input-1;
		int stars= 1;
		//Triangle generation
		for(int row = 1; row<= input; row++) {
			
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			spaces--;
			for (int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			stars += 2;
			System.out.println();
		}
	}
}
