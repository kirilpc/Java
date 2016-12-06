import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.print("Please enter the number of rows: ");
		int rows = sc.nextInt();
		while (rows < 2) {
			System.out.println("Invalid size. The number must be positive.");
			System.out.print("Please enter the number of rows: ");
			rows = sc.nextInt();
		}
		System.out.print("Please enter the number of columns: ");
		int cols = sc.nextInt();
		while (cols < 2) {
			System.out.println("Invalid size. The number must be positive.");
			System.out.print("Please enter the number of columns: ");
			cols = sc.nextInt();
		}
		//Filling the matrix + 
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		//Printing the array
		System.out.println("The array:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		//Result check
		int matrixSum = 0;
		int maxSum = 0;
		int maxRow = 0;
		int maxCol = 0;
		System.out.println("The array:");
		for (int i = 0; i < matrix.length -1; i++) {
			for (int j = 0; j < matrix[i].length -1; j++) {
				matrixSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
				if (matrixSum > maxSum) {
					maxSum = matrixSum;
					maxRow = i; 
					maxCol = j;
				}
			}
		}
		System.out.println(matrix[maxRow][maxCol] + " " + matrix[maxRow][maxCol + 1] );
		System.out.println(matrix[maxRow + 1][maxCol] + " " + matrix[maxRow + 1][maxCol + 1] );
	}
}
