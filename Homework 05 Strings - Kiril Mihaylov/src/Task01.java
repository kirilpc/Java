import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.print("Please enter the first string: ");
		String firstStr = sc.nextLine();
		if (firstStr .length() > 40) {
			System.out.println("Sorry the string is too long. I will take the first 40 chars.");
			firstStr  = firstStr.substring(0, 41);
		}
		
		System.out.print("Please enter the second string: ");
		String secondStr = sc.nextLine();
		if (secondStr.length() > 40) {
			System.out.println("Sorry the string is too long. I will take the first 40 chars.");
			secondStr  = secondStr.substring(0, 41);
		}
		//Result
		System.out.print(firstStr.toUpperCase() + " ");
		System.out.print(firstStr.toLowerCase() + " ");
		System.out.print(secondStr.toUpperCase() + " ");
		System.out.print(secondStr.toLowerCase() + " ");
	}
}
