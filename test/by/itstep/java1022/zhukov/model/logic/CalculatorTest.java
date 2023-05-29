package by.itstep.java1022.zhukov.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddPositive() {
        int a = 10;
        int b = 20;
        int expected = 30;

        int actual = Calculator.add(a, b);

        if (expected != actual) {
            fail();
        }
    }

    @Test
    public void testSubPositive() {
        int a = 10;
        int b = 20;
        int expected = -10;

        int actual = Calculator.sub(a, b);

        if (expected != actual) {
            fail();
        }
    }

    @Test
    public void testMulPositive() {
        int a = 10;
        int b = 20;
        int expected = 200;

        int actual = Calculator.mul(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivPositive() {
        int a = 100;
        int b = 20;
        int expected = 5;

        int actual = Calculator.div(a, b);

        assertEquals(expected, actual);
    }

    //    @Test
//    public void testDivByZero() {
//        int a = 100;
//        int b = 0;
//        int expected = 5;
//
//       try{
//           Calculator.div(a, b);
//           fail();
//       } catch (ArithmeticException exception){
//
//       }
//    }
    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        int a = 100;
        int b = 0;
        int expected = 5;

        Calculator.div(a, b);
    }

    @Test(timeout =  4000)
    public void testMulPerformance() {
        int a = 10;
        int b = 20;

        Calculator.mul(a, b);

    }
}
