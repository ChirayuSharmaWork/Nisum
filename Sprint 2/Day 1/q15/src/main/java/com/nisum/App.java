package com.nisum;

@FunctionalInterface
interface  MathOperation{
    int operate(int a, int b);
}


public class App
{
    public static void main(String[] args) {

        MathOperation add = (int a, int b) -> a + b;
        MathOperation subtract = (int a, int b) -> a - b;
        MathOperation multiply = (int a, int b) -> a * b;
        MathOperation divide = (int a, int b) -> a / b;

        System.out.println(add.operate(5,6));
        System.out.println(subtract.operate(5,6));
        System.out.println(multiply.operate(5,6));
        System.out.println(divide.operate(5,6));


    }

    }


