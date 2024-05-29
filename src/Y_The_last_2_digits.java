import java.util.Scanner;

public class Y_The_last_2_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong() % 100;
        int b = scanner.nextInt() % 100;
        int c = scanner.nextInt() % 100;
        int d = scanner.nextInt() % 100;
        long m = (a * b * c * d) % 100;
        if (m < 10 ){
            System.out.println("0" + m );
        }
        else {
            System.out.println(m);
        }
    }

}
