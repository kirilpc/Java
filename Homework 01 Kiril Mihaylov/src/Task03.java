import java.util.Scanner;
public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter A: ");
		double numA = sc.nextDouble();
		System.out.print("Please enter B: ");
		double numB = sc.nextDouble();
		
		double valueHolder = numA;
		numA = numB;
		numB = valueHolder;
		
		System.out.println("After the exchange the value of A is " + numA + " and the value of B is " + numB);
		
	}

}
