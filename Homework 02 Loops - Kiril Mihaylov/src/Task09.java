import java.util.Scanner;
public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please eneter a number: ");
		int firstNum = sc.nextInt();
		System.out.print("Plese enter another number: ");
		int secondNum = sc.nextInt();

		int bigger = firstNum > secondNum ? firstNum : secondNum;
		int smaller = firstNum > secondNum ? secondNum : firstNum;
		int sum = 0;
		
		for (int i = smaller; i <= bigger; i++) {
			if (i % 3== 0) {
				System.out.print("Skip " + i*i + ", ");
				continue;
			}
			
			System.out.print(i*i +", ");
			sum += i*i;
			if (sum > 200) {
				break;
			}
		}
	}

}
