import java.util.Scanner;
public class Random002{
    public static void main(String[] args) {
        for (int x = 1;x<=10;x++){
            System.out.println();
            for (int y =x;y<=10+x;y++){
                System.out.print(y%10);
            }
        }
    }
    }
