import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] mainArr = new int[10];
		System.out.print("Arr[0] = ");
		mainArr[0] = sc.nextInt();
		System.out.print("Arr[1] = ");
		mainArr[1] = sc.nextInt();
		//Creating the result array
		for (int i = 2; i < mainArr.length; i++) {
			mainArr[i] = mainArr[i-1] + mainArr[i-2];
		}
		//Printing the array
		for (int i = 0; i < mainArr.length; i++) {
			System.out.print(mainArr[i] + " ");
		}
	}
}