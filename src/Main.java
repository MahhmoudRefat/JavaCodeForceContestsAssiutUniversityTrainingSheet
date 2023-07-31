import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0){
            int t = sc.nextInt();
            long fac = 1 ;
            for (int i =1 ; i<=t ; i++){
                fac *= i ;
            }
            System.out.println(fac);
            n--;
        }

      /*  while (n--) {
            int fact = 1;
            for (int i = 0; i < n; i++) {
                fact = 1;
                int numbers = sc.nextInt();
                for (int j = 1; j <= numbers; j++) {
                    fact *= j;
                }
                System.out.println(fact);
            }
        }*/
    }
}
