import java.util.Scanner;

public class Task01v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.print("Please enter the first string: ");
		String firstStr = sc.nextLine();
		firstStr = lengthCheck(firstStr);
		
		System.out.print("Please enter the second string: ");
		String secondStr = sc.nextLine();
		secondStr = lengthCheck(secondStr);
		//Result
		System.out.println(resultGeneration(firstStr, secondStr));
	}
	//Input check
	static String lengthCheck (String inputStr) {
		if (inputStr.length() > 40) {
			System.out.println("Sorry the string is too long. I will take the first 40 chars.");
			inputStr = inputStr.substring(0, 41);
		}
		return inputStr;
	}
	//Result String generation
	static String resultGeneration (String str1, String str2) {
		String result = str1.toUpperCase() + " " + str1.toLowerCase() + " " + str2.toUpperCase() + " " + str2.toLowerCase();
		return result;
	}
}
