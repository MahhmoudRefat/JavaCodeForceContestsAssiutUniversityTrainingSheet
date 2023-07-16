import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble() ;
        double b = scanner.nextDouble() ;
        double c = scanner.nextDouble() ;
        double d = scanner.nextDouble() ;
        if (b * Math.log(a) > d *Math.log(c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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