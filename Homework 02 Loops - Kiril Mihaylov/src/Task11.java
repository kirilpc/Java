import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int input = sc.nextInt();
		
		for (int row = 1; row <= input; row++) {
			for(int i = input -row; i > 0; i--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= row*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
