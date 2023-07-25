import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int pass = sc.nextInt();
            if (pass == 1999) {
                System.out.println("Correct");
                System.exit(0);
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
