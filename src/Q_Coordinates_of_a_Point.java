import java.util.Scanner;

public class Q_Coordinates_of_a_Point {
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
