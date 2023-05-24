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

        if(expected != actual){
            fail();
        }
    }
    @Test
    public void testSubPositive() {
        int a = 10;
        int b = 20;
        int expected = -10;

        int actual = Calculator.add(a, b);

        if(expected != actual){
            fail();
        }
    }
    @Test
    public void testMulPositive() {
        int a = 10;
        int b = 20;
        int expected = 200;

        int actual = Calculator.add(a, b);

        assertEquals(expected, actual);
    }
}
