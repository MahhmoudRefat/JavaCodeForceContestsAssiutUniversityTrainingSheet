import java.util.Scanner;

public class M_Lucky_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean v = false;
        for (int i = n; i <= m; i++) {
            int a = i;
            boolean flag = false;
            while (a > 0) {
                int  x = a % 10;
                if (x != 7 && x != 4) {
                    flag = true;
                }
                a /= 10;
            }
            if (!flag) {
                System.out.print(i + " ");
                v = true;
            }

        }
        if (!v) System.out.println("-1");

    }

}

