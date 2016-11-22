import java.util.Scanner;

public class Task19 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		do {
		System.out.print("Please enter a number between 10 and 99: ");
		input = sc.nextInt();
		}
		while (input < 10 || input > 99);
		
		int newNum = 0;
		int oldNum = input;
		do {
			if (oldNum % 2 == 0) {
				newNum = oldNum/2;
			}
			else {
				newNum = oldNum*3 + 1;
			}
			System.out.print(newNum + " ");
			oldNum = newNum;
		}
		while (newNum !=1);
		
	}
}