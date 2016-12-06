import java.util.Scanner;
public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.print("Please enter the size of the array: ");
		int size = sc.nextInt();
		while (size < 1) {
			System.out.println("Invalid size. The number must be positive.");
			System.out.print("Please enter the size of the array: ");
			size = sc.nextInt();
		}
		//Filling the array
		boolean isJagged= true;
		int[] inputArr = new int[size];
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.nextInt();	
		}
		//Jagged check
		for (int i = 1; i < inputArr.length - 1; i++ ) {
			if (!(((inputArr[i] > inputArr[i+1] && inputArr[i] > inputArr[i-1]) || (inputArr[i] < inputArr[i+1] && inputArr[i] < inputArr[i-1])))) {
				isJagged = false;
			}
		}
		if (isJagged) {
			System.out.println("The array is jagged.");
		}
		else {
			System.out.print("The array is NOT jagged.");
		}
	}
}
