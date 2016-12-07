import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please enter a string: ");
		String input = sc.nextLine();
		char[] inputArr= input.toCharArray();
		//Palindrome check
		boolean isPalindrome = true;
		for (int i = 0; i < inputArr.length/2; i++) {
			if (inputArr[i] != inputArr[inputArr.length-1-i]) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("The string is a palindrome.");
		}
		else {
			System.out.println("The string is NOT a palindrome.");
		}
	}
}
