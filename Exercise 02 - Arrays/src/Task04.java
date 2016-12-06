import java.util.Scanner;

public class Task04 {

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
		//Filling the array
		int zeroCount = 0;
		int[] inputArr = new int[size];
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.nextInt();	
			while (inputArr[i] > 1 || inputArr[i] < 0) {
				System.out.println("Invalid number. The input must be 0 ot 1.");
				System.out.print("Arr[" + i + "] = ");
				inputArr[i] = sc.nextInt();	
			}
			if (inputArr[i] == 0) {
				zeroCount++;
			}
		}
		//Result
		System.out.println("Result:");
		for (int i = 0; i < inputArr.length; i++) {
			if (zeroCount > i) {
				System.out.print("0 ");
			}
			else {
				System.out.print("1 ");
			}
		}
	}
}
