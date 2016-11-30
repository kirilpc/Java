import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter size of the array: ");
		int size = sc.nextInt();
		// Input check
		while (size < 1) {
			System.out.println("Invalid size. The size must be greater than 0.");
			System.out.print("Please enter size of the array: ");
			size = sc.nextInt();
		}
		// Filling the input array
		int[] inputArr = new int[size];
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.nextInt();
		}
		// Creating the result array
		int[] resultArr = new int[size];
		resultArr[0] = inputArr[0];
		resultArr[resultArr.length -1] = inputArr[inputArr.length -1];
		for (int i = 1; i < resultArr.length -1; i ++) {
			resultArr[i] = inputArr[i - 1] + inputArr[i + 1];
		}
		//Printing the result
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}
	}
}