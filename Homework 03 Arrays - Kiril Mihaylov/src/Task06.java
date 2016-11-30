import java.util.Scanner;

public class Task06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Array 1
		System.out.print("Please enter the size of Array1: ");
		int arr1Size = sc.nextInt();
		while (arr1Size < 1) {
			System.out.println("Invalid number. The size must be greater than 0.");
			System.out.print("Please enter the size of Array1: ");
			arr1Size = sc.nextInt();
		}
		//Creating and filling the array.
		int[] firstArr = new int[arr1Size];
		for (int i = 0; i < firstArr.length;i++) {
			System.out.print("Arr1[" + i + "] = ");
			firstArr[i] = sc.nextInt();
		}
		//Array 2
		System.out.print("Please enter the size of Array2: ");
		int arr2Size = sc.nextInt();
		while (arr2Size < 1) {
			System.out.println("Invalid number. The size must be greater than 0.");
			System.out.print("Please enter the size Array2: ");
			arr2Size = sc.nextInt();
		}
		//Creating and filling the array.
		int[] secondArr = new int[arr2Size];
		for (int i = 0; i < secondArr.length;i++) {
			System.out.print("Arr2[" + i + "] = ");
			secondArr[i] = sc.nextInt();
		}
		//Result
		if (firstArr.length == secondArr.length) {
			System.out.print("The lengths of the arrays are equal");
			boolean equal = true;
			for (int i = 0; i < firstArr.length; i++) {
				if (firstArr[i] != secondArr[i]) {
					equal = false;
					break;
				}
			}
			if (equal) {
				System.out.print(" and they themselves are equal.");
			}
			else {
				System.out.print(", but they themselves are NOT equal.");
			}
		}
		else {
			System.out.println("The lengths of the arrays are NOT equal, therefore they are NOT equal. ");
		}
		
	}
}