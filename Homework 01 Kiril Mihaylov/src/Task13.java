import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter temperature: ");
		byte temp = sc.nextByte();
		
		if (temp < -20) {
			System.out.println("Ice cold!");
		}
		else if (temp >= -20 && temp < 0) {
			System.out.println("Cold.");
		} 
		else if (temp >= 0 && temp < 15) {
			System.out.println("Chilly.");
		}
		else if (temp >= 15 && temp < 25) {
			System.out.println("Warm.");
		}
		else {
			System.out.println("Hot!");
		}

	}

}
