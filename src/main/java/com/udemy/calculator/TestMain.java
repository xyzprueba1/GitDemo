package com.udemy.calculator;

public class TestMain {


    public static void main(String[] args) {

        MathOperation add =  (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

//        System.out.println(calculate(add));
//        System.out.println(calculate(subtract));
//        System.out.println(calculate(multiply));
//        System.out.println(calculate(divide));

        int onScreenNumber = 0;
        onScreenNumber = calculate(5, add, 2);
        onScreenNumber = calculate(onScreenNumber, subtract, 3);
        onScreenNumber = calculate(onScreenNumber, multiply, 7);
        onScreenNumber = calculate(onScreenNumber, add, 2);
        onScreenNumber = calculate(onScreenNumber, divide, 3);

        System.out.println(onScreenNumber);    }

//    private static int calculate(MathOperation mathOperation){
//        int a = 100;
//        int b = 5;
//
//        return mathOperation.operate(a, b);


    private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber){
//        int a = 100;
//        int b = 5;

        return mathOperation.operate(onScreenNumber, enteredNumber);

    }
}
