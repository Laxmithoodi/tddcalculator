import java.awt.*;
import java.lang.management.OperatingSystemMXBean;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Double.doubleToLongBits;
import static java.lang.Double.valueOf;


public class UserInterface {
    int typeOfCalculator;

    UserInterface() {
        typeOfCalculator = 1;
    }

    public int getTypeOfCalculator() {
        return typeOfCalculator;
    }

    public void setTypeOfCalculator(int typeOfCalculator) {
        this.typeOfCalculator = typeOfCalculator;
    }

    public void startInterface(){
        Console.println("Please select type of Calculator:  \n 1. Conventional \n 2. Scientific");

        int typeOfCalculator = Console.getInteger();

        if(typeOfCalculator==1) {


            int i = 0;
            for (int j = 0; j < 10; j++) {

                Console.println("Please select your operation type:  \n 1. Add \n 2. Subtract \n " +
                        "3. Multiply \n 4. Divide \n 5. Exponentiation  \n 6. Square Root \n 7. Square " +
                        "\n 8. Inverse of the number (1/x) \n 9. Invert the sign \n 10. Convert to Binary \n " +
                        "11. Convert to Octal \n 12. Convert to Hexadecimal \n 13. Convert to Decimal");

                int OperationType = Console.getInteger();


                if (OperationType < 6) {


                    //First number
                    Console.println("Please enter your First number " + i);

                    int num1 = Console.getInteger();
                    //Second number
                    Console.println("Please enter Second number " + i);

                    int num2 = Console.getInteger();


                    integerOperations(OperationType, num1, num2);


                } else if ((OperationType >= 6) && (OperationType <= 9)) {
                    Console.println("Please enter number " + i);


                    double num3 = Console.getInteger();
                    switch (OperationType) {
                        case 6:
                            UserOperations.squareroot(num3);
                            break;
                        case 7:
                            UserOperations.square(valueOf(num3));
                            break;
                        case 8:
                            UserOperations.inverse(num3);
                            break;
                        case 9:
                            UserOperations.inversign(num3);
                            break;
                    }
                } else if (OperationType > 9) {
                    Console.println("Please enter number");
                    int num4 = Console.getInteger();
                    switch (OperationType) {
                        case 10:
                            Scientific.IntegerAsBinary(num4);
                            break;
                        case 11:
                            Scientific.IntegerAsOctal(num4);
                            break;
                        case 12:
                            Scientific.IntegerAsHexadecimal(num4);
                            break;
                        case 13:
                            Scientific.IntegerToDecimal(num4);
                            break;
                        default:
                            Console.println("Illegal Operation");
                    }


                }
            }



        }else if(typeOfCalculator==2){

            for(int j=0;j<10;j++){

            Console.println("Please select type of Unit Mode:  \n 1. Degrees \n 2. Radians");


            int unit = Console.getInteger();


            Console.println("Please enter you number");

            double value = Console.getDouble();

            Console.println("Please select type of Operation:" +
                    "  \n 1. Sine \n 2. Cosine \n 3. Tangent \n 4. Inverse Sine" +
                    "\n 5. Inverse Cosine \n 6. Inverse Tangent");


            int operation = Console.getInteger();
                if(unit==1&&operation<4) {
                    value = Math.toRadians(value);

                }

            switch (operation) {
                case 1:
                    Scientific.sin(value);
                    break;
                case 2:
                    Scientific.cos(value);
                    break;
                case 3:
                    Scientific.tan(value);
                    break;}
                if(unit!=1 && operation>3){
                switch (operation){
                case 4:

                    Scientific.invSin(value);
                    break;
                case 5:
                    Scientific.invCos(value);
                    break;
                case 6:

                    Scientific.invTan(value);
                    break;}}
                else if (unit==1 && operation>3){


                switch (operation){
                    case 4:

                        Scientific.invSinDeg(value);
                        break;
                    case 5:
                       Scientific.invCosDeg(value);
                        break;
                    case 6:
                        Scientific.invTanDeg(value);
                        break;

                default:
                    if(operation<1||operation>7){
                    Console.println("Illegal Operation");}
            }}

            }}}





    private void integerOperations(int operationType, int num1, int num2) {
        switch (operationType) {
            case 1:
                UserOperations.add(num1, num2);
                break;
            case 2:
                UserOperations.sub(num1, num2);
                break;
            case 3:
                UserOperations.mult(num1, num2);
                break;

            case 4:
                if (num2 != 0) {
                    UserOperations.div(num1, num2);
                } else {
                    Console.println("Err");
                }
                break;
            case 5:
                UserOperations.exponent(num1, num2);
                break;
                }

    }
}

















