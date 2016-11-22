import java.util.Scanner;

public class Task17 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sideLength;
		//input + check
		do {
		System.out.print("Plsese enter the side length between 3 and 20: ");
		sideLength = sc.nextInt();
		}
		while (sideLength <3 || sideLength > 20);
		
		System.out.print("Please enter the filling symbol: ");
		char filling = sc.next().charAt(0); 
		
		//Top
		for (int i = 1; i <= sideLength; i ++) {
			System.out.print("*");
		}
		System.out.println();
		//Middle + filling
		for (int row = 1; row <= sideLength - 2; row++) {
			System.out.print("*");
			for (int col = 1; col <= sideLength - 2; col++) {
				System.out.print(filling);
			}
			System.out.println("*");
		}
		//bottom
		for (int i = 1; i <= sideLength; i ++) {
			System.out.print("*");
		}
	}
}