import java.util.Scanner;

public class Task06 {

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
		//Printing the main diagonal
		System.out.println("The main diagonal is:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
