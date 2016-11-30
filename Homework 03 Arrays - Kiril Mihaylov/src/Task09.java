import java.util.Scanner;

public class Task09 {

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
			inputArr[inputArr.length - i - 1] = sc.nextInt();
		}
		//Printing the reversed array
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print(inputArr[i] + " ");
		}
	}
}
