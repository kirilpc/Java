import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please enter the three names of two people separated by a comma:");
		String input = sc.nextLine();
		while (input.indexOf(",") != input.lastIndexOf(",")) {
			System.out.println("Ivalid input. You have more than one comma.");
			System.out.println("Please enter the three names of two people separated by a comma:");
			input = sc.nextLine();
		}
		String[] names = input.split(",");
		//ASCII value calculation via the method
		int firstNameVal = asciiValueCalculation(names[0]);
		int secondNameVal = asciiValueCalculation(names[1]);
		//Result
		System.out.println(names[0] + " has ASCII sum of " + firstNameVal);
		System.out.println(names[1].trim() + " has ASCII sum of " + secondNameVal);
		System.out.println("Result:");
		
		if (firstNameVal > secondNameVal) {
			System.out.println(names[0] + " has greater ASCII sum." );
		}
		else if (firstNameVal < secondNameVal) {
			System.out.println(names[1].trim() + " has greater ASCII sum." );
		}
		else {
			System.out.println("The names have equal ASCII value.");
		}
	}
	//ASCII value calculation method
	static int asciiValueCalculation (String name) {
		int charSum = 0;
		char[] nameToChar = name.toCharArray();
		for (int i = 0; i < nameToChar.length; i++) {
			if (nameToChar[i] != ' ' ) {  //Skipping the blank spaces
				charSum += nameToChar[i];
			}
			else {
				continue;
			}
		}
		return charSum;
	}
}
