import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int input = sc.nextInt();
		int counter = 1;
		long sum = 0;
		
		do {
			sum += counter;
			counter++;
		}
		while (counter <= input);
		
		System.out.println("The sum of all numbers between 1 and " + input + " is: " + sum);

	}

}
