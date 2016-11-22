import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a positive number: ");
		int input = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			sum +=i;
		}
		System.out.print("The sum of the numbers from 1 to " + input + " is: " + sum);

	}

}
