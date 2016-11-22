import java.util.Scanner;
public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please eneter an hour: ");
		byte hour = sc.nextByte();
		System.out.print("Please enter money: ");
		float money = sc.nextFloat();
		System.out.print("Are you sick: ");
		boolean sick = sc.nextBoolean();
		
		if (sick) {
			System.out.println("You shall not pass! ");
			if (money > 0) {
				System.out.println("You buy pills.");
			}
			else {
				System.out.println("You stay at home and drink tea.");
			}
		}
		else {
			if (money > 10) {
				System.out.println("You go to the cinema with friends.");
			}
			else {
				System.out.println("You have a coffee with friends.");
			}
		}	
	}	
}
