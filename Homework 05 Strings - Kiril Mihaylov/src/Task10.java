import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please enter a string: ");
		String input = sc.nextLine();
		char[] inputArr = input.toCharArray();

		//ResultString generation
		System.out.println("Result");
		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] += 5;
			System.out.print(inputArr[i]);
		}
	}
		
}


