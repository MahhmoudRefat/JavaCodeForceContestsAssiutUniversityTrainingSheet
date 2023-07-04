import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x = scanner.next().charAt(0);
        int ascii = (int) x;
        int x2 = 0;
        if (ascii >= 65 && ascii <= 96) {
            x2 = x + 32;
        } else {
            x2 = x - 32;
        }
        char ch = (char) x2;
        System.out.println(ch);
    }
}