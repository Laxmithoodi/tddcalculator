import java.util.Scanner;



public class UserInterface {


    public static void main(String[] args) {
        int i = 0;
        int OperationType;
        System.out.println("Please select your operation type: \n 1. Sum \n 2. Add \n 3. Subtract \n " +
                "4. Multiply \n 5. Divide \n 6. Square  \n 7. Square Root \n 8. Exponentiation " +
                "\n 9 Inverse of the number (1/x) \n 10. Invert the sign");

        Scanner Operation = new Scanner(System.in);
        OperationType = Operation.nextInt();
        //First number
        System.out.println("Please enter your First number " + i);
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        //Second number
        System.out.println("Please enter Second number " + i);
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.print("\033[H\033[2J");
/*
        switch (OperationType){
            case 1:
                System.out.println(add( num1,num2));
                break;
            case 2:
                System.out.println(sub( num1,num2));
                break;
            case 3:
                System.out.println(mult( num1,num2));
                break;
            case 4:
                System.out.println(div( num1,num2));
                break;
            default:
                System.out.println("Illigal Operation");*/
    }
}
