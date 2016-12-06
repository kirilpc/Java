import java.util.Scanner;

public class Task10 {

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
		int[] inputArr = new int[size];
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.nextInt();	
		}
		//Printing the array
		System.out.println("The array: ");
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print(inputArr[i] + " ");
		}
		System.out.println();
		//Most frequent number search
		int frequent = 1;
		int mostFriquent = 0;
		int element = 0;;
		for (int i = 0; i < inputArr.length; i++) {
			for (int j = i+1; j < inputArr.length; j++){ 
				if (inputArr[i] == inputArr[j]) {
					frequent++;
				}
			}
			if (frequent > mostFriquent) {
				mostFriquent = frequent;
				element = inputArr[i];
			}
			frequent = 1;
		}
		System.out.println("Most frequent number is " + element + " - " + mostFriquent + " times.");

	}

}
