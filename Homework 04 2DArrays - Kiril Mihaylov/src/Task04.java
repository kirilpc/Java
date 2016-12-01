import java.util.Scanner;

public class Task04 {

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
		// Creating and filling the 2D array.
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
			}
		}
		// Printing the input array.
		System.out.println("The imput array is: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// Creating and printing the rotated array
		System.out.println("Rotated array: ");
		int[][] rotation = new int[cols][rows];
		for (int i = 0; i < rotation.length; i++) {
			for (int j = 0; j < rotation[i].length; j++) {
				rotation[i][j] = matrix[(rows - j - 1)][i]; //There has to be an easier way.
				System.out.print(rotation[i][j] + " ");
			}
			System.out.println();
		}
	}
}