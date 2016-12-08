import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please enter the first character sequence: ");
		String firstStr = sc.nextLine();
		char[] firstArr = firstStr.toCharArray();
		System.out.println("Please enter the second character sequence: ");
		String secondStr = sc.nextLine();
		char[] secondArr = secondStr.toCharArray();
		
		boolean hasSameChar = false;
		int sameCharArr1 = 0;
		int sameCharArr2 = 0;
		//Same elements check
		for(int i = 0; i < firstArr.length; i++) {
			for (int j = 0; j < secondArr.length; j++) {
				if (firstArr[i] == secondArr[j]){
					hasSameChar= true;
					sameCharArr1 = i;
					sameCharArr2 = j;
					break;
				}
			}
			if (hasSameChar){
				break;
			}
		}
		//Result
		if (hasSameChar) {
			char[][] matrix = new char[secondArr.length][firstArr.length];
			//The first String is responsible for the number of columns
			//The second String is responsible for the number of rows
			System.out.println("Result:");
			for (int rows = 0; rows < secondArr.length; rows++) {
				for (int cols = 0; cols < firstArr.length; cols++) {
					if ((cols < sameCharArr1 || cols > sameCharArr1 ) && rows != sameCharArr2) {
						matrix[rows][cols] = '-';
					}
					else if (cols == sameCharArr1 ) {
						matrix[rows][cols] = secondArr[rows];
					}
					else if (rows == sameCharArr2) {
						matrix[rows][cols] = firstArr[cols];
					}
					System.out.print(matrix[rows][cols]);
				}
				System.out.println();
			}
		}
		else {
			System.out.println("The two strings don't contain same elements.");
		}
	}
}
