package com.itheima.lambda;

public class LambdaTest4 {
    public static void main(String[] args) {

        useCalculator((a, b) -> a + b);

        useCalculator((a, b) -> a - b);

    }

    public static void useCalculator(Calculator calculator) {
        int result = calculator.calc(10, 20);
        System.out.println(result);
    }

}

interface Calculator {
    int calc(int a, int b);
}
