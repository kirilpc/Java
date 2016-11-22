import java.util.Scanner;
public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enther the hour: ");
		byte hour = sc.nextByte();
		
		//24 = 00
		if ((hour >= 18 && hour < 24) || (hour >= 0 && hour <= 4)) {
			System.out.println("Good night.");
		}
		else if (hour > 4 && hour <= 9) {
			System.out.println("Good morning");
		}
		else if (hour > 9 && hour < 18) {
			System.out.println("Good day.");
		}
		else {
			System.out.println("Invalid hour.");
		}
	}

}
