import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Plese enter a number: ");
		int input = sc.nextInt();

		System.out.println("Result: ");
		
		for (int row = 0; row < input; row++ ) {
			for (int col = 0; col < input; col++) {
				System.out.print((input-1) + (2*(row)));
			}
			System.out.println();
		}
	}

}
