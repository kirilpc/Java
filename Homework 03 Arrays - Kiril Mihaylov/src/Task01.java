import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter size of the array: ");
		int size = sc.nextInt();
		//Input check
		while (size < 1) {
			System.out.println("Invalid size! The size must be greater than 0.");
			System.out.print("Please enter size of the array: ");
			size = sc.nextInt();
		}
		
		int[] inputArr = new int[size];
		int smallNum = 2147483647;//max int value
		//Filling the array
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("Array["+ i + "] = " );
			inputArr[i] = sc.nextInt();
		//Finding the smallest number where N % 3 = 0
			if (inputArr[i] % 3 == 0 && inputArr[i] < smallNum) {
				smallNum = inputArr[i];
			}
		}
		
		//Result
		if (smallNum == 2147483647) {
			System.out.print("There is no number divisible by 3.");
		}
		else {
			System.out.println("The smallest number divisible by 3 is: " + smallNum);
		}
	}
}