import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please enter a sentence: ");
		String input = sc.nextLine();
		String resultStr = "";
		//Result string generation
		for (int i = 0; i < input.length(); i++) {
	        if (input.charAt(i) == ' ') {
	            resultStr = resultStr.substring(0, i + 1) + input.substring(i + 1, i + 2).toUpperCase() + input.substring(i + 2);
	        }
	        else if(i == 0) {
	            resultStr = input.substring(0, 1).toUpperCase() + input.substring(1);
	        }
	    }
	    System.out.println("Result: " + resultStr); //
	}
}
