import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.print("Please enter the size of the array: ");
		int size = sc.nextInt();
		while (size < 1) {
			System.out.println("Invalid size. The number must be positive.");
			System.out.print("Please enter the size of the array: ");
			size = sc.nextInt();
		}
		//Filling the array + numbers check
		boolean allPositive = true;
		int[] inputArr = new int[size];
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.nextInt();
			if (inputArr[i] < 0) {
				allPositive = false;
			}
		}
		//Result
		if (allPositive) {
			System.out.println("All numbers are positive.");
		}
		else {
			System.out.println("Not all numbers are positive.");
		}
	}
	
}
