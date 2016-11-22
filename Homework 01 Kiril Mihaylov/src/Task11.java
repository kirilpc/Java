import java.util.Scanner;
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a three digit number: ");
		short imput = sc.nextShort();
		
		byte firstDigit = (byte)(imput % 10);
		byte secDigit = (byte)((imput % 100) / 10);
		byte thirdDigit = (byte)(imput / 100);
		double result;
		
		result = imput /(double)firstDigit;
		if (result % 1 != 0) {
			System.out.println(imput +" is not devisible without remainder by its first digit " + firstDigit + " = " + result);
		}
		else {
			System.out.println(imput +" is devisible without remainder by its first digit " + firstDigit + " = " + (short)result);
		}
		
		result = imput /(double)secDigit;
		if (result % 1 != 0) {
			System.out.println(imput +" is not devisible without remainder by its second digit " + secDigit + " = " + result);
		}
		else {
			System.out.println(imput +" is devisible without remainder by its second digit " + secDigit + " = " + (short)result);
		}
		
		result = imput /(double)thirdDigit;
		if (result % 1 != 0) {
			System.out.println(imput +" is not devisible without remainder by its third digit " + thirdDigit + " = " + result);
		}
		else {
			System.out.println(imput +" is devisible without remainder by its third digit " + thirdDigit + " = " + (short)result);
		}
		
	}

}
