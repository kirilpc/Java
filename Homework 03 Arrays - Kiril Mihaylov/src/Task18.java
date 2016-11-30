import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the size of the first array: ");
		int size1 = sc.nextInt();
		//Input check
		while (size1 < 1 ) {
			System.out.println("Invalid number. The size must be greater than 0.");
			System.out.print("Please enter the size of the first array: ");
			size1 = sc.nextInt();
		}	
		//Creating and filling the first array.
		int[] firstArr = new int[size1];
		for (int i = 0; i < firstArr.length; i ++) {
			System.out.print("Arr[" + i + "] = ");
			firstArr[i] = sc.nextInt();
		}
		
		System.out.print("Please enter the size of the second array: ");
		int size2 = sc.nextInt();
		//Input check
		while (size2 < 1 ) {
			System.out.println("Invalid number. The size must be greater than 0.");
			System.out.print("Please enter the size of the second array: ");
			size1 = sc.nextInt();
		}	
		//Creating and filling the second array.
		int[] secondArr = new int[size1];
		for (int i = 0; i < secondArr.length; i ++) {
			System.out.print("Arr[" + i + "] = ");
			secondArr[i] = sc.nextInt();
		}
		//Creating, filling and printing the result array
		int smaller = size1 < size2 ? size1 : size2;
		int[] resultArr = new int[smaller];
		for (int i = 0; i < resultArr.length; i++ ) {
			resultArr[i] = firstArr[i] > secondArr[i] ? firstArr[i] : secondArr[i]; 
			System.out.print(resultArr[i] + " ");
		}
	}
}
