import java.util.Scanner;

public class Task08 {

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
		//Filling the matrix 
		boolean hasTrue = false;
		boolean[][] matrix = new boolean[rows][rows];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextBoolean();
				if (i+j-1 < rows && matrix[i][j]) {
					hasTrue = true;
				}
			}
		}
		//Printing the array
		System.out.println("The array:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j]) {
					System.out.print(matrix[i][j] + "  ");
				}
				else {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
		//Result
		if (hasTrue) {
			System.out.print("There is true above the second diagonal.");
		}
		else {
			System.out.print("There is no true above the second diagonal.");
		}
	}
}
