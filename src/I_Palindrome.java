import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class I_Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "" ;
        for (int i = a.length()-1;i>=0;i--){
            b += a.charAt(i) ;
        }
        int a1 , b2 ;
        a1 = parseInt(a) ;
        b2 = parseInt(b);
        System.out.println(b2);
        if (a1 == b2 ) System.out.println("YES");
        else System.out.println("NO");
    }



    }


