import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please enter a few words separated by space: ");
		String input = sc.nextLine();
		while (input.contains(",") || input.contains(".")) { //needs more input checks
			System.out.println("Invalid word separator.");
			System.out.println("Please enter a few words separated by space: ");
			input = sc.nextLine();
		}
		String[] wordsArr = input.split(" ");
		//Longest word search
		System.out.println("The number of words is: " + wordsArr.length);
		int longestWord = 0;
		int longestWordIndex = 0;
		for (int i = 0; i < wordsArr.length; i++) {
			if (wordsArr[i].length() > longestWord) {
				longestWord = wordsArr[i].length();
				longestWordIndex = i;
			}
		}
		//Result
		System.out.println("The longest word is \"" + wordsArr[longestWordIndex] + "\" - " + longestWord + " letters.");
	}
}
