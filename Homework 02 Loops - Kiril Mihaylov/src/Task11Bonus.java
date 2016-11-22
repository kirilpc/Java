import java.util.Scanner;

public class Task11Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Please enter a number: ");
		int input = sc.nextInt();
		
		//Top
		for (int i = 1; i < input; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		
		//Middle
		for (int row = 2; row < input; row++) {
			for (int i = input - row; i > 0; i--) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for (int i = 1; i < row *2 -2; i++) {
				System.out.print(" ");
			}
			
			System.out.println("*");
		}
		
		//Bottom
		for (int i = 1; i < input*2; i++) {
			System.out.print("*");
		}
	}

}
