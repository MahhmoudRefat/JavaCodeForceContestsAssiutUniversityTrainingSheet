import java.util.Scanner;

public class U_Float_or_int {
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
