import java.util.Scanner;

public class W_Mathematical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char s = scanner.next().charAt(0);
        int b = scanner.nextInt();
        char q = scanner.next().charAt(0);
        int c = scanner.nextInt();
        switch (s) {
            case '+': {
                if (a + b == c) System.out.println("Yes");
                else System.out.println(a + b);
                break;
            }
            case '-': {
                if (a - b == c) System.out.println("Yes");
                else System.out.println(a - b);
                break;
            }
            case '*': {
                if (a * b == c) System.out.println("Yes");
                else System.out.println(a * b);
                break;
            }

        }
    }
}
