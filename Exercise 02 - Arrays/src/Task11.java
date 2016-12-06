import java.util.Scanner;

public class Task11 {

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
		//Filling the base matrix 
		System.out.println("Base matrix: ");
		int counter = 1;
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = counter;
				if (matrix[i][j] < 10) {
					System.out.print(matrix[i][j] + "   ");
				}
				else if (matrix[i][j] < 100) {
					System.out.print(matrix[i][j] + "  ");
				}
				else {
					System.out.print(matrix[i][j] + " ");
				}
				counter++;
			}
			System.out.println();
		}
		//Filling the second matrix 
		counter = 1;
		int[][] matrix2 = new int[rows][cols];
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				matrix2[j][i] = counter;
				counter++;
			}
		}
		//Print the second matrix
		System.out.println("Second matrix: ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + "  ");
			}
			System.out.println();
		}
		//Filling the third matrix 
		counter = 1;
		int[][] matrix3 = new int[rows][cols];
		for (int i = 0; i < cols; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < rows; j++) {
					matrix3[j][i] = counter;
					counter++;
				}
			}
			else {
				for (int j = rows -1; j >= 0; j--) {
					matrix3[j][i] = counter;
					counter++;
				}
			}
		}
		//Print the third matrix
		System.out.println("Third matrix: ");
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print(matrix3[i][j] + "  ");
			}
			System.out.println();
		}
		//Filling the fourth matrix HARDCORE
		int[][] matrix4 = new int[rows][cols];
		int diagonalSum = 0;
		int x = 0;
		int y = 0;
		counter = 1;
		while (counter <= rows*cols) {
			x = diagonalSum;
			while (x > rows -1) {
				x--;
				y++;
			}
			while (x >= 0 && y < cols) {
				matrix4[x][y] = counter;
				counter++;
				x--;
				y++;
			}
			diagonalSum++;
			x =0;
			y =0;
		}
		//Print the third matrix
		System.out.println("Diagonal matrix: ");
		for (int i = 0; i < matrix4.length; i++) {
			for (int j = 0; j < matrix4[i].length; j++) {
				System.out.print(matrix4[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
