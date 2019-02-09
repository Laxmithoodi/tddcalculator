

public class UserOperations {



        public static int add ( int x, int y){

            int result = x + y;
            System.out.println(x+"+"+y+"=");
            return result;

        }

        public static int sub ( int x, int y){

            int result = x - y;
            System.out.println(x+"-"+y+"=");
            return result;


        }
        public static int mult ( int x, int y){

            int result = x * y;
            System.out.println(x+"*"+y+"="+result);
            return result;
        }
        public static int div ( int x, int y){

            int result = x / y;
            System.out.println(x+"/"+y+"="+result);
            return result;
        }

        public static double square(double number){
            double sq = Math.pow(number, 2);

            return sq;
        }


        public static double squareroot ( int number){


            double sqroot = Math.sqrt(number);

            return sqroot;

        }


        public static double exponent ( double base, double power){

            double exp = Math.pow(base, power);

            return exp;
        }


        public static double inverse ( double number){

            return (1 / number);
        }


        public static double inversign ( double number){

            return (number * -1);
        }
    }
