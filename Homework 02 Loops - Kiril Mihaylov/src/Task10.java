import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int input = sc.nextInt();
		int counter = 0;
		boolean isPrime = true;
		
		for (int i = 1; i < input; i++) {
			if(input % i == 0) {
				counter++;
			}
			
			if (counter > 1) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println("The number " + input + " is " + (isPrime && input > 1 ? "prime." : "not prime. "));

	}

}
