import java.util.Scanner;

public class F_Digits_Summation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = scanner.nextLong();
        System.out.println((n % 10) + (m % 10));

    }
}
