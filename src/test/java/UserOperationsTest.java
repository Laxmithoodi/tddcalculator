

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserOperationsTest {

    UserOperations userOperations;

    public void setUp(){
       userOperations = new UserOperations();

   }


   @Test
   public void add1(){
       //:Given
       int expected = 9;

       UserOperations t1= new UserOperations();

       //When:

       int actual = t1.add(4,5);

       //:Then
       assertEquals(actual,expected);


   }

    @Test

    public void sub1(){
        //:Given
        int expected = 4;

        UserOperations t1= new UserOperations();

        //When:

        int actual = t1.sub(9,5);

        //:Then
        assertEquals(actual,expected);


    }


    @Test

    public void mult1(){
        //:Given
        int expected = 10;

        UserOperations t1= new UserOperations();

        //When:

        int actual = t1.mult(2,5);

        //:Then
        assertEquals(actual,expected);


    }

    @Test

    public void div1(){
        //:Given
        int expected = 3;

        UserOperations t1= new UserOperations();

        //When:

        int actual = t1.div(6,2);

        //:Then
        assertEquals(actual,expected);


    }

    @Test

    public void sq1(){
        //:Given
        double expected = 9.0;

        UserOperations t1= new UserOperations();

        //When:

        double actual = t1.square(3.0);

        //:Then
       assertEquals( actual, expected, 9);


    }
    @Test

    public void sqroot1(){
        //:Given
        double expected = 9.0;

        UserOperations t1= new UserOperations();

        //When:

        double actual = t1.squareroot(3);

        //:Then
        assertEquals( actual, expected, 9);


    }

    @Test

    public void exp1(){
        //:Given
        double expected = 9.0;

        UserOperations t1= new UserOperations();

        //When:

        double actual = t1.exponent(2,3);

        //:Then
        assertEquals( actual, expected, 9);


    }
    @Test

    public void inv1(){
        //:Given
        double expected = 9.0;

        UserOperations t1= new UserOperations();

        //When:

        double actual = t1.inverse(2);

        //:Then
        assertEquals( actual, expected, 9);


    }
    @Test

    public void invsign1(){
        //:Given
        double expected = 9.0;

        UserOperations t1= new UserOperations();

        //When:

        double actual = t1.inversign(4);

        //:Then
        assertEquals( actual, expected, 9);

    }
}
