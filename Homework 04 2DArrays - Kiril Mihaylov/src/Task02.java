import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Array dimensions
		System.out.print("Please enter the number of rows in the square matrix: ");
		int size = sc.nextInt();
		while (size < 1) {
			System.out.println("Invalid input. The number must be a positive integer.");
			System.out.print("Please enter the number of rows in the square matrix: ");
			size= sc.nextInt();
		}
		//Creating and filling the matrix + diagonals search
		int[] firstDiag = new int[size];
		int[] secondDiag = new int[size];
		
		int[][] matrix = new int[size][size]; 
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = sc.nextInt();
				if (i == j) {
					firstDiag[i] = matrix[i][j];
				}
				if (i + j == matrix.length - 1) {
					secondDiag[i] = matrix[i][j];
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
		//Printing the two diagonals
		System.out.println("The diagonals are:");
		for (int i = 0; i < firstDiag.length; i++) {
			System.out.print(firstDiag[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < secondDiag.length; i++) {
			System.out.print(secondDiag[i] + " ");
		}
	}
}