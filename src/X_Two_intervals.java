import java.util.Scanner;

public class X_Two_intervals {
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
