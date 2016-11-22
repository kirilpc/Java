import java.util.Scanner;
public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a1: ");
		double a1 = sc.nextDouble();
		System.out.print("Please enter a2: ");
		double a2 = sc.nextDouble();
		System.out.print("Please neter a3: ");
		double a3 = sc.nextDouble();
		
		double valueHolder = a1;
		double valueHolder2 = a3;
		a1 = a2;
		a2 = valueHolder2;
		a3 = valueHolder;
		
		System.out.println("Result: a1 = " + a1 + " a2 = " + a2 + " a3 = " + a3);
	}

}