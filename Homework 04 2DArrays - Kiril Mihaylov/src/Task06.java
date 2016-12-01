import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Array dimensions
		System.out.print("Please enter the number of rows: ");
		int rows = sc.nextInt();
		while (rows < 1) {
			System.out.print("Invalid. You need at least one row.");
			System.out.print("Please enter the number of rows: ");
			rows = sc.nextInt();
		}
		System.out.print("Please enter the number of columns: ");
		int cols = sc.nextInt();
		while (cols < 1) {
			System.out.print("Invalid. You need at least one column.");
			System.out.print("Please enter the number of columns: ");
			cols = sc.nextInt();
		}
		// Creating and filling the 2D array. + Rows sum
		int rowSum = 0;
		int totalSum = 0;
		int[] resultArr = new int[rows/2];
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();	
				if (i % 2 == 1) {
					rowSum += matrix[i][j];
				}
			}
			if (i % 2 == 1){
				resultArr[(i/2)] = rowSum;
				totalSum += rowSum;
				rowSum = 0;
			}
		}
		//Printing the input array
		System.out.println("The input array is:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}	
		//Printing results
		System.out.println("Result:");
		for(int i = 1; i < matrix.length; i+=2) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("Sum = " + resultArr[((i-1)/2)]);
		}
		System.out.println("The sum of these rows is " + totalSum);
	}
}
