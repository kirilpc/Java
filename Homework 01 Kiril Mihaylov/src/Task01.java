import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter value for A: ");
		double numA = sc.nextDouble();
		System.out.print("Please enter value for B: ");
		double numB = sc.nextDouble();
		System.out.print("Please evter value for C: ");
		double numC = sc.nextDouble();
		
		if (numC > numA && numC < numB) {
			System.out.println("The number " + numC + " is between " + numA + " and " + numB);
		}
		else {
			System.out.println("The number " + numC + " is not between " + numA + " and " + numB);
		}
	}

}
