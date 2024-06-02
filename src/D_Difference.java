import java.util.Scanner;

public class D_Difference {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long b = scanner.nextLong();
        int c = scanner.nextInt();
        long d = scanner.nextLong();
        long x =( (a * b) - (c * d));
        System.out.println("Difference = "+ x);


    }
}
