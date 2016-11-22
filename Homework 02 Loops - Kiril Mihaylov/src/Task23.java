
public class Task23 {
	
	public static void main(String[] args) {
		
		byte firstNum = 1;
		byte secondNum = 1;
		
		while (firstNum < 10) {
			System.out.print(firstNum + "*" + secondNum + "; ");
			secondNum++;
			if (secondNum == 10) {
				firstNum++;
				secondNum = firstNum;
				System.out.println();
			}
		}
	}
}