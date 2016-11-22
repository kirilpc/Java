import java.util.Scanner;

public class Task22 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		do {
			System.out.print("Plseasenter a number between 1 and 999: ");
			input = sc.nextInt();
		}
		while (input < 1 || input > 999);
		
		int counter = input;
		byte resultCounter = 1;
		
		while(resultCounter <= 10) {
			if (counter % 2 == 0 || counter % 3 == 0 || counter % 5 == 0) {
				System.out.print(resultCounter+ ":" + counter + ", ");
				resultCounter++;
			}
			counter++;
		}	
	}
}