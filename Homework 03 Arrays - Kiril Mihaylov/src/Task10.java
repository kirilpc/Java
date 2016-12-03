import java.util.Scanner;

public class Task10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//filling the array
		int[] mainArr = new int[7];
		int sum = 0;
		for (int i = 0; i < mainArr.length; i++) {
			System.out.print("Arr[" + i + "] = ");
			mainArr[i] = sc.nextInt();
			sum += mainArr[i];
		}
		//Result calculation
		double average = (double)sum / mainArr.length;		
		double minDif = 2147483647;//max int
		double difference;
		int minIndex = 0;
		for (int i = 0; i < mainArr.length; i++) {
			difference = mainArr[i] - average;
			if (Math.abs(difference) < minDif) {
				minDif = Math.abs(difference);
				minIndex = i;
			}
		}
		System.out.println("The average is " + average);
		System.out.println("The closest number is " + mainArr[minIndex]);
	}
}