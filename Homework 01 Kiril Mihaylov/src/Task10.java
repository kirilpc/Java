import java.util.Scanner;
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please neter the volume: ");
		short volume = sc.nextShort();
		
		if (volume % 5 == 0) {
			System.out.print("You will use the two buckets " + volume/5 + " times." );
		}
		else if (volume % 5 == 1) {
			System.out.print("You will use the two buckets " + (volume/5 - 1) + " times and the three liters bucket 2 times." );
		}
		else if (volume % 5 == 2){
			System.out.print("You will use two buckets " + volume/5 + " times and the two liters bucket 1 time.");
		}
		else if (volume % 5 == 3) {
			System.out.print("You will use two buckets " + volume/5 + " times and the three liters bucket 1 time.");
		}
		else {
			System.out.print("You will use two buckets " + volume/5 + " times and the two liters bucket 2 time.");
		}
	}

}
