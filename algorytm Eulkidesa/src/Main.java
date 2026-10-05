
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Podaj a:");
     int a = scanner.nextInt();

     System.out.print("Podaj b:");
     int b = scanner.nextInt();
        while( a != b){

            if(a > b){
                 a = a - b;
                 if(a == b){
                     System.out.println(a);
                 }

            }
            else {
                b = b - a;
                if(a == b){
                    System.out.println(b);
                }
            }

        }

    }
}