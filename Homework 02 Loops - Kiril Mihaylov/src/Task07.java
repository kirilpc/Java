import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Plese enter a positive number: ");
		int input = sc.nextInt();
		
		System.out.println("Result: ");
		for (int i = 3; i < input*3; i+=3) {
			System.out.print(i + ", ");
		}
		System.out.println(input*3);
		
	}

}
