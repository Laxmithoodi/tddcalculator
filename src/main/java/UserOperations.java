
import java.lang.*;
public class UserOperations {


    public static int add(int x, int y) {
        int result = x + y;

        Console.println(x + " + " + y + " = " + result);
        return result;
    }

    public static String addBin(int x, int y) {
        String result = Integer.toBinaryString(x) + Integer.toBinaryString(y);

        Console.println(x + " + " + y + " = " + result);
        return result;
    }

    public static int sub(int x, int y) {

        int result = x - y;
        Console.println(x + " - " + y + " = " + result);
        return result;
    }

        public static int mult( int x, int y){

        int result = x * y;
        Console.println(x + " * " + y + " = " + result);
        return result;
    }

    public static int div(int x, int y) {

        int result = x / y;
       Console.println(x + "/" + y + " = " + result);
        return result;
    }

    public static double square(double number) {
        double sq = Math.pow(number, 2);
       Console.println("Square of " + number + " = " + sq);
        return sq;
    }


    public static double squareroot(double number) {


        double sqroot = Math.sqrt(number);
        Console.println("Square root of " + number + " = " + sqroot);
        return sqroot;

    }


    public static double exponent(int base, int power) {

        double exp = Math.pow(base, power);
        Console.println(base +"power of " + power + " = " + exp);
        return exp;
    }


        public static double inverse(double number) {
        Console.println("The inverse number of "+number+ " is "+(1/number));
        return (1/number);
    }


        public static double inversign(double number) {
        Console.println("Inverse sign "+ (number*-1));

        return (number * -1);
    }




}