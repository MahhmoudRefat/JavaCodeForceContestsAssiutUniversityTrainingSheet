import java.util.Scanner;

public class J_Primes_from_1_to_n {

    static Boolean ISPrime(int i){
        if (i == 2 ) return true;
        for (int k = 2 ;k <= i/2 ; k++)
        {
            if (i % k == 0 ){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2 ; i <= n ; i++ ){
            if(ISPrime(i)){
                System.out.print(i + " ");
            }
        }


}
}
