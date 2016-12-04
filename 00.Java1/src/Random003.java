import java.util.Scanner;
public class Random003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("КОЛКО ДА Е ГОЛЯМА ЕЛХАТА? (препоръчан размер: 10 до 25)");
		int alt=sc.nextInt();
		for (int row=1;row<=alt;row++){
			for( int y=1; y<=2*alt-1;y++){
				if(y==alt+1-row || y==alt+row-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int x=0;x<alt*2-1;x++){
			System.out.print("*");
		}
		System.out.println();
		for (int trunk=1;trunk<=3;trunk++){
			for(int trunk1=0;trunk1<=alt*2;trunk1++){
				if(trunk1>=alt-2&&trunk1<alt+1){
					System.out.print("H");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}