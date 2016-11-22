import java.util.Scanner;
public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the day: ");
		byte day = sc.nextByte();
		System.out.print("Please enter the month: ");
		byte month = sc.nextByte();
		System.out.print("Please enter the year: ");
		short year = sc.nextShort();
		byte maxDays = 0;
		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		System.out.println("The next date is: ");
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			maxDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			maxDays = 30;
			break;
		case 2: {
			if (leapYear){
			maxDays = 29;
			}
			else {
				maxDays = 28;
				}
			}
			break;
		default:
			System.out.println("Invalid month.");
			break;
		}
		if (day < maxDays) {
			day++;
		}
		else {
			day = 1;
			if (month != 12) {
				month++;
			}
			else {
				month = 1;
				year++;
			}
		}
		System.out.println(day +", "+ month + ", " + year);
	}

}
