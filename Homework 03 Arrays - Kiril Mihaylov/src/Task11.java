import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creating and filling the array
		int[] mainArr = new int[7];
		for (int i = 0; i < mainArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			mainArr[i] = sc.nextInt();
		}
		//Finding and printing the results
		for (int i = 0; i < mainArr.length; i++) {
			if (mainArr[i] % 5 == 0 && mainArr[i] > 5) {
				System.out.print(mainArr[i] + " ");
			}
		}		
	}
}