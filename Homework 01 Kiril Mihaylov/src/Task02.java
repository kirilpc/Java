import java.util.Scanner;;
public class Task02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a whole number: ");
		int firstNum = sc.nextInt();
		System.out.print("Please enter another whole number: ");
		int secondNum = sc.nextInt();
		
		int sum = firstNum + secondNum;
		int subtraction = firstNum - secondNum;
		int multiplication = firstNum * secondNum;
		int divRemainder= firstNum % secondNum;
		int division = firstNum / secondNum;
		
		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + subtraction);
		System.out.println("The multiplication result is " + multiplication);
		System.out.println("The division remainder is " + divRemainder);
		System.out.println("The integer division result is " + division);
	}
	
}
