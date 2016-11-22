import java.util.Scanner;

public class Task16 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstNum;
		//input check
		do {
		System.out.print("Please enter a number between 10 and 5555: ");
		firstNum = sc.nextInt();
		}
		while (firstNum > 5555 || firstNum < 10);
		
		int secondNum;
		//input check
		do {
		System.out.print("Please enter another number between 10 and 5555: ");
		secondNum = sc.nextInt();
		}
		while (secondNum > 5555 || secondNum < 10);
		
		int biggerNum = firstNum > secondNum ? firstNum : secondNum;
		int smallerNum = firstNum > secondNum ? secondNum : firstNum;
		
		for	(int i = biggerNum; i >= smallerNum; i--) {
			if (i % 50 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
