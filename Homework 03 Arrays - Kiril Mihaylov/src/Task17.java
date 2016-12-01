import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter size of the array: ");
		int size = sc.nextInt();
		//Input check
		while (size < 1 ) {
			System.out.println("Invalid number. The size must be greater than 0.");
			System.out.print("Please enter a valid size for the array: ");
			size = sc.nextInt();
		}	
		//Creating and filling the array.
		int[] inputArr = new int[size];
		for (int i = 0; i < inputArr.length; i ++) {
			System.out.print("Arr[" + i + "] = ");
			inputArr[i] = sc.nextInt();
		}
		//Zigzag check
		boolean zigzag = true;
		if (inputArr[0] > inputArr[1]) {
			for (int i = 1;i < inputArr.length -1; i+=2 ) {
				if (inputArr[i] >= inputArr[i-1] || inputArr[i] >= inputArr[i+1]) {
					zigzag = false;
					break;
				}
			}
			//Last element check
			if (inputArr.length % 2 == 0) {
				if (inputArr[inputArr.length -1] >= inputArr[inputArr.length -2]) {
					zigzag = false;
				}
			}
		}
		else {
			for (int i = 1;i < inputArr.length -1; i+=2 ) {
				if (inputArr[i] <= inputArr[i-1] || inputArr[i] <= inputArr[i+1]) {
					zigzag = false;
					break;
				}
			}
			//Last element check
			if (inputArr.length % 2 == 0) {
				if (inputArr[inputArr.length -1] <= inputArr[inputArr.length -2]) {
					zigzag = false;
				}
			}
		}
		//Reasult
		if (zigzag) {
			System.out.println("The variables have zigzagging values. ");
		}
		else {
			System.out.println("The variables do NOT have zigzagging values.");
		}
	}
}
