import java.util.Scanner;

public class Task14 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creating and filling the input array
		System.out.print("Please enter size of the array: ");
		int size = sc.nextInt();
		while (size < 1) {
			System.out.println("The size must be greater than zero.");
			System.out.print("Please enter size of the array: ");
			size = sc.nextInt();
		}
		double[] inputArr = new double[size];
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.nextDouble();
		}
		//Creating and filling the result array [-2.99 ..2.99]
		double[] resultArr = new double[inputArr.length];
		int resultCount = 0;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] >= -2.99 && inputArr[i] <= 2.99) {
				resultArr[resultCount] = inputArr[i];
				resultCount++;
			}
		}
		//Printing the result array
		System.out.println("The resulting array [-2.99..2.99] is: ");
		for (int i = 0; i < resultCount; i++) {
			System.out.print(resultArr[i] + " ");
		}
	}
}