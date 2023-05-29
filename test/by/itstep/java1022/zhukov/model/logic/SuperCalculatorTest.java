package by.itstep.java1022.zhukov.model.logic;

import org.junit.*;

import static org.junit.Assert.*;

public class SuperCalculatorTest {
    private static SuperCalculator calc;
    public SuperCalculatorTest() {
        System.out.println("create object");
    }

    @Before
    public void setUp(){
//        calc = new SuperCalculator();
    }

    @BeforeClass
    public static void init(){
      calc = new SuperCalculator();
    }

    @AfterClass
    public static void destroy(){
     calc  = null;
    }

    @After
    public void tearDown(){
        System.out.println("after");
//        calc = null;
    }

    @Test
    public void add() {
        int a = 10;
        int b = 20;
        int expected = 30;

        int actual = calc.add(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void sub() {
        int a = 10;
        int b = 20;
        int expected = -10;

        int actual = calc.sub(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void mul() {
    }

    @Test
    public void div() {
    }
}