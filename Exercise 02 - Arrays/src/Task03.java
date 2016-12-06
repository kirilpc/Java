import java.util.Scanner;

public class Task03 {

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
		System.out.print("Please enter the searched char: ");
		char searched = sc.next().charAt(0);
		//Filling the array + char search
		boolean isContained= false;
		int charIndex = 0;
		char[] inputArr = new char[size];
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.next().charAt(0);	
			if (inputArr[i] == searched) {
				isContained = true;
				charIndex = i;
			}
		}
		if (isContained) {
			System.out.println("The char '" + searched + "' is contained in the array at index " + charIndex);
		}
		else {
			System.out.println("The char is not contained in the array.");
		}
	}
}
