import java.util.Scanner;

public class D_Fixedpassword {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            int pass = sc.nextInt();
            if (pass == 1999) {
                System.out.println("Correct");
                System.exit(0);
            } else {
                System.out.println("Wrong");
            }
    }
}
