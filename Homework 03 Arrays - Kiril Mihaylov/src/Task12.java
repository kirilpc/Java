import java.util.Scanner;

public class Task12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creating and filling the array
		int[] mainArr = new int[7];
		for (int i = 0; i< mainArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			mainArr[i] = sc.nextInt();
		}
		//Creating the result array
		int[] resultArr = new int[7];
		//index 0 and 1 via third variable
		int holder = mainArr[0];
		mainArr[0] = mainArr[1];
		mainArr[1] = holder;
		//index 2 and 3 via sum 
		mainArr[2] = mainArr[2] + mainArr[3];
		mainArr[3] = mainArr[2] - mainArr[3];
		mainArr[2] = mainArr[2] - mainArr[3];
		//index 4 and 5 via multiplication
		mainArr[4] = mainArr[4] * mainArr[5];
		mainArr[5] = mainArr[4] / mainArr[5];
		mainArr[4] = mainArr[4] / mainArr[5];
		for (int i = 0; i < mainArr.length; i++ ) {
			System.out.print(mainArr[i] + " ");
		}
		//used http://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/
	}
}