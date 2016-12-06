
public class Task02 {
	
	public static void main(String[] args) {
		//Task2. Write a program that prints all odd numbers between 0 and 50 and all even numbers between 51 and 100.
		
		for (int i = 1; i < 50; i+=2) {
			System.out.print(i + " ");
		}
		for (int i = 52; i < 100; i+=2) {
			System.out.print(i + " ");
		}
	}
}