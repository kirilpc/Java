import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// System.out.println("It's time to DUDUDU DUEL... wrong anime...");
		int input;
		do {
			System.out.print("Plese enter a card number between 1 and 51: ");
			input = sc.nextInt();
		} while (input < 1 || input > 51); // 

		byte card;
		byte cardType;

		for (int i = input -1; i < 52; i++) {
			card = (byte) (i / 4 + 2); // +2 for easier representation
			cardType = (byte) (i % 4);

			switch (card) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10: {
				System.out.print(card + " of ");
			}
				break;
			case 11:
				System.out.print("Jack of ");
				break;
			case 12:
				System.out.print("Queen of ");
				break;
			case 13:
				System.out.print("King of ");
				break;
			case 14:
				System.out.print("Ace of ");
				break;
			default:
				// System.out.print("Blue-Eyes White Dragon");
				break;
			}
			switch (cardType) {
			case 0:
				System.out.print("clubs; ");
				break;
			case 1:
				System.out.print("diamonds; ");
				break;
			case 2:
				System.out.print("hearts; ");
				break;
			case 3:
				System.out.print("spades; ");
				break;
			default:
				break;
			}

		}

	}
}