import java.util.Scanner;
public class Task16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a three digit number: ");
		short imput = sc.nextShort();
		
		byte a = (byte)(imput / 100);
		byte b = (byte)((imput % 100) / 10);
		byte c = (byte)(imput % 10);
		
		if (a == b && b == c) {
			System.out.println("The digits are all equal. " + a + " = " + b + " = " + c);
		}
		else if (a > b && b > c) {
			System.out.println("The digits are in descending order. " + a + " > " + b + " > " + c);
		}
		else if (a < b && b < c) {
			System.out.println("The digits are in ascending order. " + a + " < " + b + " < " + c);
		}
		else {
			System.out.println("No order.");
		}
	}

}
