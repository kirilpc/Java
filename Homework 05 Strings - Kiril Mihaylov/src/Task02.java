import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please eneter two words (10..20 letters each), separated by a space: ");
		String input = sc.nextLine();
		
		while (input.indexOf(' ') != input.lastIndexOf(' ') || input.length() < 21 || input.length() > 41) {
			System.out.println("Invalid input. Each word must be from 10 to 20 characters long and separated by a single space.");
			System.out.println("Please eneter two words (10..20 letters), separated by a space: ");
			input = sc.nextLine();
		}
		//Result
		String[] wordsArr = input.split(" ");
		int longestWord = wordsArr[0].length() > wordsArr[1].length() ? wordsArr[0].length() : wordsArr[1].length();
		String newWord = wordsArr[1].substring(0, 5)+ wordsArr[0].substring(5);
		
		System.out.println("The longest word has " + longestWord + " characters.");
		System.out.println("The combined word is " + newWord);
	}
}
