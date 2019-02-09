

public class UserOperations {



        public static int add ( int x, int y){

            int result = x + y;

            return result;

        }

        public static int sub ( int x, int y){

            int result = x - y;

            return result;


        }
        public static int mult ( int x, int y){

            int result = x * y;

            return result;
        }
        public static int div ( int x, int y){

            int result = x / y;
            return result;
        }

        public double square ( double number){
            double sq = Math.pow(number, 2);

            return sq;
        }


        public double squareroot ( double number){

            double sqroot = Math.sqrt(number);

            return sqroot;

        }


        public double exponent ( double base, double power){

            double exp = Math.pow(base, power);

            return exp;
        }


        public double inverse ( double number){

            return (1 / number);
        }


        public double inversign ( double number){

            return (number * -1);
        }
    }
