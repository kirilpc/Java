import java.util.Scanner;

public class Task08 {
	
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
		//Result calculation
		int longNum = inputArr[0];
		int longCount = 1;
		int tempNum = inputArr[0];
		int tempCount = 1;
		for (int i = 1; i < inputArr.length; i++) {
			if (inputArr[i] == inputArr[i-1]) {
				tempCount++;
				if (tempCount > longCount) {
					longNum = tempNum;
					longCount = tempCount;
				}
			}
			else {
				tempNum = inputArr[i];
				tempCount = 1;
			}
		}		
		//Result print
		System.out.println("the longest series of identical consecutive elements are : ");
		for (int i = 0; i < longCount; i++) {
			System.out.print(longNum + " ");
		}
	}
}