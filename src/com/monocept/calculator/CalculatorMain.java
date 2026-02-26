package com.monocept.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Addition result: " + Addition.add(a, b));

        System.out.println("Subtraction result: " + Subtract.subtract(a, b));
        System.out.println("Multiplication result: " + Multiply.multiply(a, b));
        System.out.println("Division result: " + Division.divide(a, b));
    }
}
