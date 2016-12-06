import java.util.Scanner;

public class Task09version2 {

	public static void main(String[] args) {
		//Task9. Modify task 8 to print a triangle that is hollow and has only a frame of stars.
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
		int stars = 1;
		int innerSpaces = 1;
		//Triangle generation
		for(int row = 1; row<= input; row++) {
			
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			spaces--;
			if (row >= 2 && row < input) {
				System.out.print("*");
				for (int j = 1; j <= innerSpaces; j++) {
					System.out.print(" ");
				}
				innerSpaces +=2;
				System.out.print("*");
			}
			else {
				for (int j = 1; j <= stars; j++) {
					System.out.print("*");
				}
			}
			stars += 2;
			System.out.println();
		}
	}
}
