import java.util.Scanner;
import java.math.BigInteger;

public class Task25 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int input = sc.nextInt();
		int counter = 1;
		long factorial = 1; //can use BigInteger for bigger factorials
		
		do {
			factorial*= counter;
			counter++;
		}
		while (counter <= input);
		System.out.println(input + "! = " + factorial);
	}
}