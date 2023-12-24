package Playground;

import Playground.Calculator.Calculator;

public class CalculatorClient {

    public static void main(String[] args) {
        Calculator c1 = new Calculator(4, 5);
        System.out.println("Sum is "+ c1.sum());
        System.out.println("Sum is "+ c1.sub());
        System.out.println("Sum is "+ c1.mul());
        System.out.println("Sum is "+ c1.div());
    }
    
}
