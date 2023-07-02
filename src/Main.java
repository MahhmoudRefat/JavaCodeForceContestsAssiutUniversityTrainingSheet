import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         char x = scanner.next().charAt(0);
        if (x >= 48 && x <=64)
        {
            System.out.println("IS DIGIT");
        }
    else if (x >= 65 && x <= 96){
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        }
    else {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }
    }
}