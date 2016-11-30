import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter size of the array: ");
		int size = sc.nextInt();
		//Input check
		while (size < 1) {
			System.out.println("Invalid size. The size must be greater than 0.");
			System.out.print("Please enter size of the array: ");
			size = sc.nextInt();
		} 
		//Filling the input array
		int[] inputArr = new int[size]; 
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.nextInt();
		}
		//Creating the result array
		int[] resultArr = new int[inputArr.length * 2];
		for (int i = 0; i < inputArr.length; i++) {
			resultArr[i] = inputArr[i];
			resultArr[resultArr.length - i - 1] = inputArr[i];
		}
		//Printing the result array
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}
	}
}