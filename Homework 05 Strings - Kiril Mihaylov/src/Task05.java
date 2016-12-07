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
			System.out.println("Result:");
			for (int rows = 0; rows < secondArr.length; rows++) {
				for (int cols = 0; cols < firstArr.length; cols++) {
					if ((cols < sameCharArr1 || cols > sameCharArr1 ) && rows != sameCharArr2) {
						System.out.print("-");
					}
					else if (cols == sameCharArr1 ) {
						System.out.print(secondArr[rows]);
					}
					if (rows == sameCharArr2 && cols != sameCharArr1) {
						System.out.print(firstArr[cols]);
					}
				}
				System.out.println(); //Why it works.... MAGIC (no idea). Proba gre6ka malko se poly4i v taq zada4a.
			}
		}
		else {
			System.out.println("The two strings don't contain same elements.");
		}
	}
}
