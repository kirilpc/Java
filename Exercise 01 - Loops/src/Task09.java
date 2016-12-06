import java.util.Scanner;

public class Task09 {

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
		//Top
		for(int i = 0; i < input - 1; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		//Middle
		for (int i = 0; i < input - 2; i++) {
			for (int j = input - 2 -i; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 0; j < i*2 + 1; j++ ) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		//Bottom
		for (int i = 0; i < input*2 -1; i++) {
			System.out.print("*");
		}
	}
}
