import java.util.Scanner;

public class Task05 {

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
		// Creating and filling the 2D array + finding the biggest row sum.
		int maxRow = 0;
		int rowSum = 0;
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
				rowSum += matrix[i][j];
			}
			if (rowSum > maxRow) {
				maxRow = rowSum;
			}
			rowSum = 0;
		}
		//Finding the biggest column sum + printing the array
		int colSum = 0;
		int maxCol = 0;
		System.out.print("The input array is:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
				colSum += matrix[j][i];
			}
			if (colSum > maxCol) {
				maxCol = colSum;
			}
			System.out.println();
			colSum = 0;
		}	
		//Result
		System.out.println("The biggest row sum is: " + maxRow);
		System.out.println("The biggest column sum is: " + maxCol);
		if (maxRow > maxCol) {
			System.out.println("The biggest row sum is greater than the biggest column sum.");
		}
		else if (maxRow < maxCol) {
			System.out.println("The biggest column sum is greater than the biggest row sum.");
		}
		else {
			System.out.println("The biggest column sum is equal to the biggest row sum.");
		}
	}
}
