import java.util.Scanner;
public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//i.stack.imgur.com/YxP53.gif 
		//My board. The cordinates start at the bottom left side.
		
		System.out.print("Enter the X position of your first figure: ");
		byte xFig1 = sc.nextByte();
		System.out.print("Enter the Y position of your first figure: ");
		byte yFig1 = sc.nextByte();
		System.out.print("Enter the X position of your second figure: ");
		byte xFig2 = sc.nextByte();
		System.out.print("Enter the Y position of your second figure: ");
		byte yFig2 = sc.nextByte();
		
		if ((xFig1 + yFig1) % 2 == 0 ) {
			System.out.println("Your first figure is on a black square.");
		}
		else {
			System.out.println("Your first figure is on a white square.");
		}
		
		if ((xFig2 + yFig2) % 2 == 0 ) {
			System.out.println("Your second figure is on a black square.");
		}
		else {
			System.out.println("Your second figure is on a white square.");
		}
		
		if ((xFig1 + yFig1) % 2 == (xFig2 + yFig2) % 2 ) {
			System.out.println("Your figures are on squares with the same color.");
		}
		else {
			System.out.println("Your figures are NOT on squares with the same color.");
		}
		
		
	}

}
