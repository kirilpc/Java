import java.util.Scanner;

public class Task01 {

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
		//Creating and filling a 2D array. + min and max check
		int min = 2147483647;
		int max = -2147483647;
		int[][] matrix = new int[rows][cols]; //Call NEO
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Matrix[" + i +"][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
				if (min > matrix[i][j]) {
					min = matrix[i][j];
				}
				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}
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
		//Results
		System.out.println("MIN = " + min);
		System.out.println("MAX = " + max);
	}
}
