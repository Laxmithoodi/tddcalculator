

import java.util.Scanner;

import static java.lang.Double.valueOf;


public class UserInterface {


    public static void main(String[] args) {
        int i = 0;
        int OperationType;
        System.out.println("Please select your operation type:  \n 1. Add \n 2. Subtract \n " +
                "3. Multiply \n 4. Divide \n 5. Exponentiation  \n 6. Square Root \n 7. Square " +
                "\n 8. Inverse of the number (1/x) \n 9. Invert the sign");

        Scanner Operation = new Scanner(System.in);
        OperationType = Operation.nextInt();


            //First number
            System.out.println("Please enter your First number " + i);
            Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            int num2=0;
            if(OperationType < 5) {
                //Second number
                System.out.println("Please enter Second number " + i);
                Scanner input2 = new Scanner(System.in);
                num2 = input2.nextInt();
            }





            switch (OperationType) {
                case 1:
                    System.out.println(UserOperations.add(num1, num2));

                    break;
                case 2:
                    UserOperations.sub(num1, num2);
                    break;
                case 3:
                    UserOperations.mult(num1, num2);
                    break;
                case 4:
                    UserOperations.div(num1, num2);
                    break;
                case 5:
                    System.out.println(UserOperations.exponent(num1, num2));
                    break;
                case 6:
                    System.out.println(UserOperations.squareroot(num1));
                    break;
                case 7:
                    System.out.println(UserOperations.square(valueOf(num1)));
                    break;
                case 8:
                    System.out.println(UserOperations.inverse(num1));
                    break;
                case 9:
                    System.out.println(UserOperations.inversign(num1));
                    break;
                default:
                    System.out.println("Illigal Operation");



            }
        }

}
