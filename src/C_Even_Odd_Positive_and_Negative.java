import java.util.Scanner;

public class C_Even_Odd_Positive_and_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of integers to check

        int evenCount = 0, oddCount = 0, positiveCount = 0, negativeCount = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
    }
}
