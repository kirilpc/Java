import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.print("Please enter the number of rows: ");
		int rows = sc.nextInt();
		while (rows < 1) {
			System.out.println("Invalid size. The number must be positive.");
			System.out.print("Please enter the number of rows: ");
			rows = sc.nextInt();
		}
		System.out.print("Please enter the number of columns: ");
		int cols = sc.nextInt();
		while (cols < 1) {
			System.out.println("Invalid size. The number must be positive.");
			System.out.print("Please enter the number of columns: ");
			cols = sc.nextInt();
		}
		//Filling the matrix + sum check
		int rowSum = 0;
		int maxSum = 0;
		int maxIndex = 0;
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
				rowSum += matrix[i][j];
			}
			if (rowSum > maxSum) {
				maxSum = rowSum;
				maxIndex = i;
			}
			rowSum = 0;
		}
		System.out.println("Row number " + (maxIndex + 1) + " has the biggest sum = " + maxSum);
	}
}
