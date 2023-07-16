public class AcceptedContests {
    /* A - Say Hello With C++
    * Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Hello, "+s);
        */

/*
B - Basic Data Types
Scanner scanner = new Scanner(System.in);
        int intvariable = scanner.nextInt();
        long longvariable = scanner.nextLong();
        char charvariable = scanner.next().charAt(0);
        float floatvariable = scanner.nextFloat();
        double doubvariable = scanner.nextDouble()  ;
        System.out.println(intvariable);
        System.out.println(longvariable);
        System.out.println(charvariable);
        System.out.println(floatvariable);
        System.out.println(doubvariable);
 */
    /*
C - Simple Calculator
    * Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long y = scanner.nextLong();
        System.out.println(x + " + " + y +" = "+ (x+y));
        System.out.println(x + " * " + y +" = "+ (x*y));
        System.out.println(x + " - " + y +" = "+ (x-y));
    * */
    /*
    D - Difference
    Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        long b = scanner.nextLong();
        int c = scanner.nextInt();
        long d = scanner.nextLong();
        long x =( (a * b) - (c * d));
        System.out.println("Difference = "+ x);
     */
    /*B - Basic Data Types
     */
    /*F - Digits Summation
Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = scanner.nextLong();
        System.out.println((n % 10) + (m % 10));

     */


    /*
   G -  summation from 1 to N

       Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        System.out.println((x*(x+1))/2);

     */
    /*
    I - Welcome for you with Conditions
     Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
     */
    /*
    J. Multiples
     Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a%b == 0 || b%a == 0 ){
            System.out.println("Multiples");
        }
        else {
            System.out.println("No Multiples");
        }
     */

    /*
    L - The Brothers

     Scanner scanner = new Scanner(System.in);
        String f1 = scanner.next();
        String s1 = scanner.next();
        String f2 = scanner.next();
        String s2 = scanner.next();

        if (Objects.equals(s1, s2)) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
     */
    /*
        M. Capital or Small or Digit

       Scanner scanner = new Scanner(System.in);
         char x = scanner.next().charAt(0);
        if (x >= 48 && x <=64)
        {
            System.out.println("IS DIGIT");
        }
    else if (x >= 65 && x <= 96){
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        }
    else {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }
     */

    /*
    Scanner scanner = new Scanner(System.in);
        char x = scanner.next().charAt(0);
        int ascii = (int) x;
        int x2 = 0;
        if (ascii >= 65 && ascii <= 96) {
            x2 = x + 32;
        } else {
            x2 = x - 32;
        }
        char ch = (char) x2;
        System.out.println(ch);
     */
    /*
    Q. Coordinates of a Point

    Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x != 0f && y == 0f) {
            System.out.println("Eixo X");
        } else if (x == 0f && y != 0f) {
            System.out.println("Eixo Y");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
     */
    /*
    U. Float or int
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

     */
    /*
    W. Mathematical
 Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char s = scanner.next().charAt(0);
        int b = scanner.nextInt();
        char q = scanner.next().charAt(0);
        int c = scanner.nextInt();
        switch (s) {
            case '+': {
                if (a + b == c) System.out.println("Yes");
                else System.out.println(a + b);
                break;
            }
            case '-': {
                if (a - b == c) System.out.println("Yes");
                else System.out.println(a - b);
                break;
            }
            case '*': {
                if (a * b == c) System.out.println("Yes");
                else System.out.println(a * b);
                break;
            }

        }

     */

    /*
    X - Two intervals

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
     */
    /*
    Y - The last 2 digits

     Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong() % 100;
        int b = scanner.nextInt() % 100;
        int c = scanner.nextInt() % 100;
        int d = scanner.nextInt() % 100;
        long m = (a * b * c * d) % 100;
        if (m < 10 ){
            System.out.println("0" + m );
        }
        else {
            System.out.println(m);
        }
     */
    /*
    Z - Hard Compare

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
     */
}
