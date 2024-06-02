import java.util.Scanner;

public class G_summation_from1_toN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        System.out.println((x*(x+1))/2);
    }
}
