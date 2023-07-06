import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x != 0f && y == 0f) {
            System.out.println("Eixo X");
        } else if (x == 0f && y != 0f) {
            System.out.println("Eixo Y");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
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