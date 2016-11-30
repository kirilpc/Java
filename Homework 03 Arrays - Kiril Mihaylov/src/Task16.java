import java.util.Scanner;

public class Task16 {
	
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
		float[] inputArr = new float[size + 1];
		for (int i = 1; i < inputArr.length; i++) {
			System.out.print("Arr[" + (i-1) + "] = ");
			inputArr[i] = sc.nextFloat();
		}
		//Creating the result array
		float[] resultArr = new float[inputArr.length];
		for (int i = 1; i < resultArr.length; i++) {
			if (inputArr[i] < -0.231) {
				resultArr[i] = (float)(i*i + 41.25);
			}
			else {
				resultArr[i] = inputArr[i] * i;
			}
		}
		//Printing the two arrays
		for (int i = 1; i < inputArr.length; i++) {
			System.out.print(inputArr[i] + " ");
		}
		System.out.println("Resulting array: ");
		for (int i = 1; i < resultArr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}
	}
}