import java.lang.*;
public class Scientific {

    public static String IntegerAsBinary(int value) {
        Console.println("Binary value is "+Integer.toBinaryString(value));
        return Integer.toBinaryString(value);
    }
    public static String IntegerAsOctal(int value) {

        Console.println("Octal Value is "+ Integer.toOctalString(value));
        return Integer.toOctalString(value);
    }

    public static String IntegerAsHexadecimal(int value) {
        String result = Integer.toHexString(value);
        Console.println("Hexadecimal value is "+result);
        return result;
    }

    public static double IntegerToDecimal(int value) {

        double decimal = value;
        Console.println("Decimal value is "+decimal);
        return decimal;
    }


    public static double sin(double number) {
        double result = Math.sin(number);
        Console.println("Sine"+ " = "+result);
        return result;

        }


    public static double cos(double number) {
        double result = Math.cos(number);
        Console.println("Cosine"+" = "+result);
        return result;
    }


    public static double tan(double number) {
        double result = Math.tan(number);
        Console.println("Tangent"+" = "+result);
        return result;
    }


    public static double invSin(double number) {
        double result = Math.asin(number);
        Console.println("Inverse Sine"+" = "+result);
        return result;
    }

    public static double invCos(double number) {
        double result = Math.acos(number);
        Console.println("Inverse Cosine"+" = "+result);
        return Math.acos(number);
    }
    public static double invTan(double number) {
        double invTa = Math.atan(number);
        Console.println("Inverse Tangent"+" = "+invTa);
        return Math.toDegrees(invTa);
    }
    public static double invCosDeg(double number) {
        double result = Math.acos(number);
        Console.println("Inverse Cosine"+" = "+Math.toDegrees(result));
        return Math.acos(number);
    }
    public static double invSinDeg(double number) {
        double invTa = Math.asin(number);
        Console.println("Inverse Tangent" + " = " + Math.toDegrees(invTa));
        return Math.toDegrees(invTa);
    }
    public static double invTanDeg(double number) {
        double tangent = Math.atan(number);

        Console.println("Inverse Tangent"+" = "+Math.toDegrees(tangent));
        return Math.atan(tangent);
    }

}