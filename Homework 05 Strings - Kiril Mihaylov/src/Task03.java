import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please enter the first string (without spaces): ");
		String firstStr = spaceCheck(sc.nextLine());
		System.out.println("Please enter the second string (without spaces): ");
		String secondStr = spaceCheck(sc.nextLine());
	
		//Length check
		int longestStr = 0;
		if (firstStr.length() > secondStr.length()) {
			longestStr = firstStr.length();
			System.out.println("The first string is longer(" + firstStr.length() + " characters)." );
		}
		else if (firstStr.length() < secondStr.length()) {
			longestStr = secondStr.length();
			System.out.println("The second string is longer(" + secondStr.length() + " characters).");
		}
		else {
			longestStr = firstStr.length();
			System.out.println("The strings have equal length (" + firstStr.length() + " characters).");
		}
		//Elements check
		char[] firstArr = firstStr.toCharArray();
		char[] secondArr = secondStr.toCharArray();
		if (firstStr.length() == secondStr.length() && firstStr.equals(secondStr)) {
			System.out.print("The strings are equal.");
		}
		else {
			System.out.println("Different elements: first string - second string: ");
			for (int i = 0; i < longestStr; i++) {
				if ((firstArr.length-1 > i && secondArr.length-1 > i ) && firstArr[i] == secondArr[i]) {
						continue;		
				}
				else {
					System.out.print("Index " + i + ": ");
					if (i > firstArr.length-1) {
					System.out.print("The string has ended. - ");
					}
					else {
						System.out.print(firstArr[i] + " - ");
					}
					if (i > secondArr.length-1) {
						System.out.print("The string has ended.");
					}
					else {
						System.out.print(secondArr[i]);
					}
				}
				System.out.println();
			}
		}
		System.out.println("The end.");
	}
	//Checking the strings for spaces
	static String spaceCheck (String input) {
		Scanner sc = new Scanner(System.in);
		while (input.contains(" ")) {
			System.out.println("Invalid string. The string must not contain spaces");
			System.out.println("Please enter another string:");
			input = sc.nextLine();
		}
		return input;
	}
}
