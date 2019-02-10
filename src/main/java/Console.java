import java.util.Scanner;

public class Console {



    public static void println(String message) {
        System.out.println(message);
    }

    public static int getInteger(){


        Scanner value1= new Scanner(System.in);
        int unit = value1.nextInt();
        return unit;
    }

    public static double getDouble(){
        Scanner value1= new Scanner(System.in);
        double unit = value1.nextDouble();
        return unit;
    }

}
