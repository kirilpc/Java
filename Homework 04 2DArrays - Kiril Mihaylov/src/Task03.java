import java.util.Scanner;

public class Task03 {
	
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
		//Creating and filling the array + sum of all elements
		int sum = 0;
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Matrix[" + i +"][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
				sum += matrix[i][j];
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
		//Result
		System.out.println("The sum of all variables in the array is: " + sum);
		System.out.println("The average of all variables in the array is: " + (sum / (float)(rows*cols)));
	}
}