package by.itstep.java1022.zhukov.model.logic;

public class SuperCalculator {
    private int count;

    public int getCount() {
        return count;
    }
    public SuperCalculator() {
        count = 0;
    }
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {

        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}


