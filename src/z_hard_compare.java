import java.util.Scanner;

public class z_hard_compare {
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
