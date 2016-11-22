import java.util.Scanner;

public class Task24 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		byte firstDigit;
		byte secondDigit;
		byte thirdDigit;
		byte fourthDigit;
		boolean isPalindrome = false;
		
		do {			
			do {
				System.out.print("Please enter a number between 10 and 30000: ");
				input = sc.nextInt();
				
			}
			while (input < 10 || input > 30000);
			
			if (input >= 10 && input < 100) {
				firstDigit = (byte)(input /10);
				secondDigit = (byte)(input % 10);
				if (firstDigit == secondDigit) {
					isPalindrome = true;
				}
			}
			else if (input >= 100 && input < 1000) {
				firstDigit = (byte)(input / 100);
				thirdDigit = (byte)(input % 10);
				if (firstDigit == thirdDigit) {
					isPalindrome = true;
				}
			}
			else if (input >= 1000 && input < 10000) {
				firstDigit = (byte)(input /1000);
				secondDigit = (byte)((input / 100) % 10);
				thirdDigit = (byte)((input / 10) % 10);
 				fourthDigit = (byte)(input % 10);
 				if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
					isPalindrome = true;
				}
			}
			else {
				firstDigit = (byte)(input /10000);
				secondDigit = (byte)((input / 1000) % 10);
				thirdDigit = (byte)((input / 10) % 10);
 				fourthDigit = (byte)(input % 10);
 				if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
					isPalindrome = true;
				}
			}
			if (isPalindrome) {
				System.out.println("The number " + input + " is a palindrome.");
			}
			else {
				System.out.println("The number " + input + " is NOT a palindrome.");
			}
			//preparing for the next iteration
			firstDigit = 0;
			secondDigit = 0;
			thirdDigit = 0;
			fourthDigit= 0;
			isPalindrome = false;
		}
		while (true); //forever 

	}
}