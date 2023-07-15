import java.util.Scanner;

public class Main {
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