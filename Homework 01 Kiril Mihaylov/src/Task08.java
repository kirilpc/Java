import java.util.Scanner;
public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a 4 digit number: ");
		short input = sc.nextShort();
		
		byte firstNum = (byte)((input / 1000)*10 + input % 10); 
		byte secNum = (byte)((input / 10) %100);
		
		if (firstNum > secNum) {
			System.out.print(firstNum + " > " + secNum);
		}
		else if (firstNum < secNum) {
			System.out.print(firstNum + " < " + secNum);
		}
		else {
			System.out.print(firstNum + " = " + secNum);
		}
	}
}
