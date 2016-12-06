import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		//Task3. Write a program that prints all numbers from A to B that can be divided by 3. A and B - from 
		//operator from console. Numbers must be in ascending order.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter A: ");
		int firstNum = sc.nextInt();
		System.out.print("Please enter B: ");
		int secondNum = sc.nextInt();
		
		int bigger = firstNum > secondNum ? firstNum : secondNum;
		int smaller = firstNum > secondNum ? secondNum : firstNum;
		//Result
		System.out.println("All numbers from " + smaller + " to " + bigger + " that can be divided by 3 are: ");
		for (int i = smaller; i <= bigger; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
}