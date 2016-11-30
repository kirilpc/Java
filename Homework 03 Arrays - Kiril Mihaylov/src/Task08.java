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
		int longNum = 0;
		int longCount = 0;
		int tempNum = 0;
		int tempCount = 0;
		//Result search
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == tempNum) {
				tempCount++;
			}
			else {
				if (tempCount > longCount) {
					longNum = tempNum;
					longCount = tempCount;
				}
				tempNum = inputArr[i];
				tempCount = 1;
			}
		}
		//check the last value - can't think of a better way at the moment
		if (tempCount > longCount) {
			longNum = tempNum;
			longCount = tempCount;
		}
		
		//Result print
		System.out.println("the longest series of identical consecutive elements are : ");
		for (int i = 0; i < longCount; i++) {
			System.out.print(longNum + " ");
		}
	}
}