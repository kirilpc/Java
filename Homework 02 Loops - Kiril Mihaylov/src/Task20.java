
public class Task20 {
	
	public static void main(String[] args) {
		
		byte counter;
		for(int row = 1; row <= 10; row++) {
			counter = (byte)row;
			for (int col = 1; col <= 10; col++) {
				if (counter == 10) {
					counter = 0;
				}
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}

//		1 2 3 4 5 6 7 8 9 0
//		2 3 4 5 6 7 8 9 0 1
//		3 4 5 6 7 8 9 0 1 2
//		4 5 6 7 8 9 0 1 2 3
//		5 6 7 8 9 0 1 2 3 4
//		6 7 8 9 0 1 2 3 4 5
//		7 8 9 0 1 2 3 4 5 6
//		8 9 0 1 2 3 4 5 6 7
//		9 0 1 2 3 4 5 6 7 8
//		0 1 2 3 4 5 6 7 8 9
	}
}