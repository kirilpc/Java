
public class Task01 {
	
	public static void main(String[] args) {
		//Task1. Write a program that prints all numbers between -100 and 100. Then print them backwards.
		//-100..100
		System.out.println("From -100 to 100: ");
		for (int i = -100; i <= 100; i++) {
			System.out.print(i + " ");
		}
		//100..-100
		System.out.println();// New line.
		System.out.println("From 100 to -100: ");
		for(int i = 100; i >= -100; i--) {
			System.out.print(i + " ");
		}
	}
}
