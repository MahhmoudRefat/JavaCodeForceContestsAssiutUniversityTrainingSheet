import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        int parsx = (int) x;
        float f = x - parsx;
        if (x - parsx > 0) {
            System.out.print("float " + parsx );
            System.out.printf(" %.3f", f);
        } else {
            System.out.println("int " + parsx);
        }
    }
}
/*
  String input = scanner.nextLine();
        char a = input.charAt(0);
        char s = input.charAt(1);
        char b = input.charAt(2);

    int a = scanner.nextInt();
    char s = scanner.next().charAt(0);
    int b = scanner.nextInt();
    int result = 0;
        if (s == '+') {
                result = a + b;
                } else if (s == '−') {
                result = a - b;
                } else if (s == '*') {
                result = a * b;
                } else {
                result = a / b;
                }
                System.out.println(result);


 */