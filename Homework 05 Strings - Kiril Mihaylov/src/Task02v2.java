import java.util.Scanner;

public class Task02v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please enter two words (10..20 letters each) separated by a single space:");
		String firstWord = sc.next();
		String secondWord = sc.next();
		while (firstWord.length() < 10 || firstWord.length() > 20 || secondWord.length() < 10 || secondWord.length() > 20) {
			System.out.println("Invalid input. Each word must be from 10 to 20 characters long and separated by a single space.");
			System.out.println("Please eneter two words (10..20 letters each), separated by a space: ");
			firstWord = sc.next();
			secondWord = sc.next();
		}
		//Result
		int longestWord = firstWord.length() > secondWord.length() ? firstWord.length() : secondWord.length();
		String newWord = secondWord.substring(0,5) + firstWord.substring(5);
		
		System.out.printf("The longest word has %s letters", longestWord); //In the name of practice.
		System.out.println();
		System.out.printf("The new word is %s", newWord);
	}
}
