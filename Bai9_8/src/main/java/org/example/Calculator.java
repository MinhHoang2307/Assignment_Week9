package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) { return a / b; }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("--- UET Calculator App is Running ---");
        System.out.println("Ket qua phep cong 5 + 10 la: " + calc.add(5, 10));
    }
}
