
import java.text.DecimalFormat;
import java.util.Scanner;

public class E_Area_of_a_Circle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        double r = scanner.nextDouble();
        double pi = 3.141592653;
        double result = pi *r*r ;
        DecimalFormat df = new DecimalFormat("#.#########");
        String formattedNumber = df.format(result);
        System.out.println(formattedNumber);
    }}


        //String formattedNumber = String.format("%.9f", result);
        /*double r = scanner.nextDouble();

        double pi = Math.PI;
        double result = pi * r * r;

        DecimalFormat df = new DecimalFormat("#.#########");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        String formattedNumber = df.format(result);

        System.out.println(formattedNumber); }*/

