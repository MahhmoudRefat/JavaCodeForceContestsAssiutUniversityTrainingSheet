import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int l2 = scanner.nextInt();
        int r2 = scanner.nextInt();
        if (Math.max(l1, l2) > Math.min(r1, r2)) {
            System.out.println("-1");
        } else {
            System.out.println(Math.max(l1, l2) + " " + Math.min(r1, r2));
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