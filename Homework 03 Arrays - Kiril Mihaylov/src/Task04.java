import java.util.Scanner;

public class Task04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter size of the array: ");
		int size = sc.nextInt();
		//Input check
		while (size < 1 ) {
			System.out.println("Invalid number. The size must be greater than 0.");
			System.out.print("Please enter size of the array: ");
			size = sc.nextInt();
		}	
		//Creating and filling the array.
		int[] inputArr = new int[size];
		for (int i = 0; i < inputArr.length; i ++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.nextInt();
		}
		//Palindrome array check
		boolean palindrome = true; 
		for (int i = 0; i < inputArr.length / 2; i++) {
			if (inputArr[i] != inputArr[inputArr.length - i - 1]) {
				palindrome = false;
				break;
			}
		}
		//Printing the array
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print(inputArr[i] + " ");
		}
		System.out.println();			
		//Result	
		if (palindrome) {
			System.out.println("The array is a palindrome.");
		}
		else {
			System.out.println("The array is NOT a palindrome.");
		}
		
	}
}