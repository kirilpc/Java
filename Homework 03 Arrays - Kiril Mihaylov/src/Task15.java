import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creating and filling the input array
		System.out.print("Please enter a size greater than 2: ");
		int size = sc.nextInt();
		while (size < 3) {
			System.out.println("The size must be greater than 2.");
			System.out.print("Please enter a size greater than 2: ");
			size = sc.nextInt();
		}
		double[] inputArr = new double[size];
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.nextDouble();
		}
		// Creating and filling the result array
		double biggest = 0;
		int bigIndex = 0;
		double[] resultArr = new double[3];
		for (int i = 0; i < resultArr.length; i++) {
			for (int j = 0; j < inputArr.length; j++) {
				if (Math.abs(inputArr[j]) > Math.abs(biggest)) {
					biggest = inputArr[j];
					bigIndex = j;
				}
			}
			resultArr[i] = biggest;
			inputArr[bigIndex] = 0;
			biggest = 0;
		}
		// Printing the result array
		System.out.print("The modulus variables with greatest sum are: ");
		for (int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}
	}
}