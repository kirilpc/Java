import java.util.Scanner;
public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Plese enter a number: ");
		int firstNum = sc.nextInt();
		System.out.print("Plese enter another number: ");
		int secondNum = sc.nextInt();
		
		int bigger = firstNum > secondNum ? firstNum : secondNum;
		int smaller = firstNum > secondNum ? secondNum : firstNum;
		
		System.out.println("The numbers from " + smaller + " to " + bigger + " are: ");
		for (int i = smaller; i <= bigger; i++) {
			System.out.print(i + " ");
		}
		
	}

}
