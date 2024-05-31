import java.util.Objects;
import java.util.Scanner;

public class L_The_Brothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f1 = scanner.next();
        String s1 = scanner.next();
        String f2 = scanner.next();
        String s2 = scanner.next();

        if (Objects.equals(s1, s2)) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
    }
}
