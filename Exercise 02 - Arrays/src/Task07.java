import java.util.Scanner;

public class Task07 {

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
		//Filling the matrix 
		long multiply = 1;
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
				if (i > j) {
					multiply *= matrix[i][j];
				}
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
		//Result
		System.out.print("The result of all multiplications is " + multiply);
	}
}
