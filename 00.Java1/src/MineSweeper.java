import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Create field 
		System.out.print("Please enter the height of the fuild: ");
		int numberOfRows = sc.nextInt();
		while (numberOfRows < 1) {
			System.out.println("Invalid number. The height of the fuild must be greater than 0.");
			System.out.print("Please enter the height of the fuild: ");
			numberOfRows = sc.nextInt();
		}
		System.out.print("Please enter the length of the fuild: ");
		int numberOfColumns = sc.nextInt();
		while (numberOfColumns < 1) {
			System.out.println("Invalid number. The length of the fuild must be greater than 0.");
			System.out.print("Please enter the length of the fuild: ");
			numberOfColumns = sc.nextInt();
		}
		System.out.print("Please enter the number of mines: ");
		int mines = sc.nextInt();
		while (mines < 1) {
			System.out.println("You need at least one mine.");
			System.out.print("Please enter the number of mines: ");
			mines = sc.nextInt();
		}
		char[][] fuild = new char[numberOfRows + 2][numberOfColumns + 2];//2 for borders 
		for (int rows = 0; rows < fuild.length; rows++) {
			for (int cols = 0; cols < fuild[rows].length; cols++) {
		//frame
				if ((rows == 0 || rows == fuild.length - 1) || (cols == 0 || cols == fuild[1].length - 1)) {
					fuild[rows][cols] = '#';
				}
			}
		}
		//MINES - slow 
		int minesCount = 0;
		Random random = new Random();
		int randomRow = 0;
		int randomCol = 0;
		while(minesCount < mines) {
			randomRow = random.nextInt(numberOfRows);
			randomCol = random.nextInt(numberOfColumns);
			if (fuild[randomRow+1][randomCol+1] != '*') {
				fuild[randomRow+1][randomCol+1] = '*';
				minesCount++;
			}
			else {
				continue;
			}
		}
		//numbers
		int elementsCount = 0;
		for (int rows = 1; rows < fuild.length -1; rows++) {
			for (int cols = 1; cols < fuild[1].length -1; cols++) {
				if(fuild[rows][cols] == '*') {
					continue;
				}
				if (fuild[rows-1][cols-1] == '*') elementsCount++;
				if (fuild[rows-1][cols] == '*') elementsCount++;
				if (fuild[rows-1][cols+1] == '*') elementsCount++;
				if (fuild[rows][cols-1] == '*') elementsCount++;
				if (fuild[rows][cols+1] == '*') elementsCount++;
				if (fuild[rows+1][cols-1] == '*') elementsCount++;
				if (fuild[rows+1][cols] == '*') elementsCount++;
				if (fuild[rows+1][cols+1] == '*') elementsCount++;
				
				if (elementsCount == 0) {
					fuild[rows][cols] = '-';
				}
				else {
					fuild[rows][cols] = (char)(elementsCount + 48);
				}
				elementsCount = 0;
			}
		}	
		//The actual game
		int sideNum = 0;
		int safeFields = numberOfRows*numberOfColumns - mines;
		int emptyFields = 0;
		boolean alive = true;
		int inputRow = 0;
		int inputCol = 0;
		char[][] gameFuild = new char[numberOfRows + 2][numberOfColumns + 2];//2 for borders 
		
		//Empty field print
				for (int rows = 0; rows < gameFuild.length; rows++) {
					for (int cols = 0; cols < gameFuild[rows].length; cols++) {
						if ((rows == 0 || rows == gameFuild.length - 1) || (cols == 0 || cols == gameFuild[1].length - 1)) {
							gameFuild[rows][cols] = '#';
						}
						System.out.print(gameFuild[rows][cols]);
					}
					System.out.print(sideNum + rows);
					System.out.println();
				}
		//The main loop
		do {
			//Cordinates input
			System.out.print("ROW (1.." + numberOfRows + "): ");
			inputRow = sc.nextInt();
			while (inputRow < 1 || inputRow > numberOfRows) {
				System.out.println("Invalid input.");
				System.out.print("ROW (1.." + numberOfRows + "): ");
				inputRow = sc.nextInt();
			}
			System.out.print("COL (1.." + numberOfColumns + "): ");
			inputCol = sc.nextInt();
			while (inputCol < 1 || inputCol > numberOfColumns) {
				System.out.println("Invalid input.");
				System.out.print("COL (1.." + numberOfColumns + "): ");
				inputCol = sc.nextInt();
			}
			//Printing the gameField
			for (int rows = 0; rows < gameFuild.length; rows++) {
				for (int cols = 0; cols < gameFuild[rows].length; cols++) {
					gameFuild[inputRow][inputCol] = fuild[inputRow][inputCol];
					//frame
					if ((rows == 0 || rows == gameFuild.length - 1) || (cols == 0 || cols == gameFuild[1].length - 1)) {
						gameFuild[rows][cols] = '#';
					}
					//mine check
					if (gameFuild[inputRow][inputCol] == '*') {
						alive = false;
					}
					if (gameFuild[inputRow][inputCol] == '-') {
						if (fuild[inputRow-1][inputCol-1] == '-') gameFuild[inputRow-1][inputCol-1] = '-';
						if (fuild[inputRow-1][inputCol] == '-') gameFuild[inputRow-1][inputCol] = '-';
						if (fuild[inputRow-1][inputCol+1] == '-') gameFuild[inputRow-1][inputCol+1] = '-';
						if (fuild[inputRow][inputCol-1] == '-') gameFuild[inputRow][inputCol-1] = '-';
						if (fuild[inputRow][inputCol+1] == '-') gameFuild[inputRow][inputCol+1] = '-';
						if (fuild[inputRow+1][inputCol-1] == '-') gameFuild[inputRow+1][inputCol-1] = '-';
						if (fuild[inputRow+1][inputCol] == '-') gameFuild[inputRow+1][inputCol] = '-';
						if (fuild[inputRow+1][inputCol+1] == '-') gameFuild[inputRow+1][inputCol+1] = '-';	
					}
					if (gameFuild[rows][cols] == '\u0000') {
						emptyFields++;
					}
					System.out.print(gameFuild[rows][cols]);
				}
				System.out.print(sideNum + rows);
				System.out.println();
			}	
			safeFields = emptyFields - mines;
			//Win condition.
			if (safeFields == 0) {
				break;
			}
			else if (alive){
				System.out.println("There are " + safeFields + " safe fields left.");
			}
			emptyFields = 0;
		} while (alive);
		
		//End game result.
		if (alive) {
			System.out.println("Congratulations! You have nerves of STEEL!");
//			__   __            _    _ _____ _   _ _ 
//			\ \ / /           | |  | |_   _| \ | | |
//			 \ V /___  _   _  | |  | | | | |  \| | |
//			  \ // _ \| | | | | |/\| | | | | . ` | |
//			  | | (_) | |_| | \  /\  /_| |_| |\  |_|
//			  \_/\___/ \__,_|  \/  \/ \___/\_| \_(_)
			System.out.println("__   __            _    _ _____ _   _ _ ");
			System.out.println("\\ \\ / /           | |  | |_   _| \\ | | |");
			System.out.println(" \\ V /___  _   _  | |  | | | | |  \\| | |");
			System.out.println("  \\ // _ \\| | | | | |/\\| | | | | . ` | |");
			System.out.println("  | | (_) | |_| | \\  /\\  /_| |_| |\\  |_|");
			System.out.println("  \\_/\\___/ \\__,_|  \\/  \\/ \\___/\\_| \\_(_)");
		}
		else {
			System.out.println("BOOM GOES THE MINE! ");
			System.out.println("GAME OVER");
			System.out.println("Better luck next time.");
		}
	}
}
