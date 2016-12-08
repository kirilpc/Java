import java.util.Scanner;
public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input
		System.out.println("Please enter a string with numbers in it:");
		String input = sc.nextLine();
		char[] inputArr = input.toCharArray();
		//Numbers search via StringBuilder
		int sum = 0;
		int counter = 0;
		while (counter < inputArr.length) {
			StringBuilder nextNum = new StringBuilder();
			if (counter < inputArr.length && ((inputArr[counter] == '-')  || (inputArr[counter] >= '0' && inputArr[counter] <= '9'))){
				nextNum.append(inputArr[counter]);
				counter++;
				while (counter < inputArr.length && (inputArr[counter] >= '0' && inputArr[counter] <= '9')) {
					nextNum.append(inputArr[counter]);
					counter++;
				}
				if (!nextNum.toString().equals("-")) { //Multiple '-' skip
					System.out.println(nextNum.toString());
					sum += Integer.parseInt(nextNum.toString());
				}
			}
			else {
			counter++;
			}
		}
		System.out.println("The sum is: "+ sum);
	}
}
//Result check:
//--asd--12sdf45-56a--sdf100--