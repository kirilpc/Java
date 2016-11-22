import java.util.Scanner;
public class Task09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a two digit integer: ");
		byte firstNum = sc.nextByte();
		System.out.print("Please enter another two digit integer: ");
		byte secNum = sc.nextByte();
		
		short product = (short)(firstNum * secNum);
		System.out.print(product + ", " + product % 10 + (product % 2 == 1 ? " odd" : " even"));
	}
	
}
