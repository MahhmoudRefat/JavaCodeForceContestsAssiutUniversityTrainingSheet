import java.util.Scanner;

public class G_Factorial {
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
    }
}
