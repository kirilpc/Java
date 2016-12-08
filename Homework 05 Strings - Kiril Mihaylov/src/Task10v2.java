import java.util.Scanner;

public class Task10v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please enter a string: ");
		String input = sc.nextLine();
		char[] inputArr = input.toCharArray();

		//ResultString generation with StringBuilder
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] += 5;
			result.append(inputArr[i]);
		}
		System.out.println("Result:");
		System.out.println(result.toString());
	}
		
}


