import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		//input check
		do {
			System.out.print("Please enter a number between 10 and 200: ");
			input = sc.nextInt();
		}
		while (input > 200 || input < 10);
		
		for (int i = input-1;i > 0; i--) {
			if (i % 7 == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
