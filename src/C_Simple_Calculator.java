import java.util.Scanner;

public class C_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + " + " + y +" = "+ (x+y));
        System.out.println(x + " * " + y +" = "+ ((long)x*y));
        System.out.println(x + " - " + y +" = "+ (x-y));
    }
}
