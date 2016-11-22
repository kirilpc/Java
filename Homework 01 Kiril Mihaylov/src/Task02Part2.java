import java.util.Scanner;;
public class Task02Part2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a real number: ");
		double firstNum = sc.nextDouble();
		System.out.print("Please enter another real number: ");
		double secondNum = sc.nextDouble();
		
		double sum = firstNum + secondNum;
		double subtraction = firstNum - secondNum;
		double multiplication = firstNum * secondNum;
		double divRemainder= firstNum % secondNum;
		double division = firstNum / secondNum;
		
		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + subtraction);
		System.out.println("The multiplication result is " + multiplication);
		System.out.println("The division remainder is " + divRemainder);
		System.out.println("The division result is " + division);
	}
	
}
