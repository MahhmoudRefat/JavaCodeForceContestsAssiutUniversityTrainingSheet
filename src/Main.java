import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long y = scanner.nextLong();
        System.out.println(x + " + " + y +" = "+ (x+y));
        System.out.println(x + " * " + y +" = "+ (x*y));
        System.out.println(x + " - " + y +" = "+ (x-y));

    }
}