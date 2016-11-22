import java.util.Scanner;
public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number for A: ");
		double numA = sc.nextDouble();
		System.out.print("Please enter a nymber for B: ");
		double numB = sc.nextDouble();
		
		if (numA > numB ) {
			System.out.println(numA + " " + numB);
		}
		else {
			System.out.print(numB + " " + numA);
		}
		
	}

}
