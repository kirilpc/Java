import java.util.Scanner;

public class Task18 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstNum;
		do {
			System.out.print("Please enter a number between 1 and 9: ");
			firstNum = sc.nextByte();
		}
		while (firstNum < 1 || firstNum > 10);
		
		int secondNum;
		do {
			System.out.print("Please enter another number between 1 and 9: ");
			secondNum = sc.nextByte();
		}
		while (secondNum < 1 || secondNum > 10);
		
		for (int i = 1; i <= firstNum; i++) {
			for (int j = 1; j <= secondNum; j++) {
				System.out.println(i +" * " + j + " = " + i*j);
			}
		}
	}
}