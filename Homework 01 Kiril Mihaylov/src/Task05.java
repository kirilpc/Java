import java.util.Scanner;
public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please neter a number for A: ");
		double numA = sc.nextDouble();
		System.out.print("Please enter a number for B: ");
		double numB = sc.nextDouble();
		System.out.print("Please enter a number for C: ");
		double numC = sc.nextDouble();
		double biggestNum , secNum, smallestNum;
		
		if (numA > numB && numA > numC) {
			biggestNum = numA;
			if (numB > numC) {
				secNum = numB;
				smallestNum= numC;
			}
			else {
				secNum = numC;
				smallestNum = numB;
			}
		}
		else if ( numB > numA && numB > numC) {
			biggestNum = numB;
			if (numA > numC) {
				secNum = numA;
				smallestNum = numC;
			}
			else {
				secNum = numC;
				smallestNum = numA;
			}
		}
		else {
			biggestNum = numC;
			if (numA > numB) {
				secNum = numA;
				smallestNum = numB;
			}
			else {
				secNum = numB;
				smallestNum = numA;
			}
		}
		
		System.out.println(biggestNum + " " + secNum + " " + smallestNum);
		//Doesn't work if there are equal numbers.
		
		//BrainDamage :D
		//System.out.println(Math.max(Math.max(numA, numB), numC) + " " + Math.min(Math.max(numA, numB), Math.max(numB, numC)) + " " + Math.min(Math.min(numA, numB), numC));

	}

}
 