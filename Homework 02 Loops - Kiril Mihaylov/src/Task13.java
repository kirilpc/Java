import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		//input check
		do {
		System.out.print("Please enter a number between 2 and 27: ");
		input = sc.nextInt();
		}
		while (input > 27 || input < 2 );
			
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		
		for (int i = 100; i < 1000; i++) {
			firstDigit = i / 100;
			secondDigit = (i /10) %10;
			thirdDigit = i % 10;
			
			if (firstDigit + secondDigit + thirdDigit == input) {
				System.out.print(i + ", ");
			}
		}

	}

}
