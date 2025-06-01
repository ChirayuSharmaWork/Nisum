package com.nisum;



@FunctionalInterface
interface Sum{
    int sumOfTwoNumbers(int a, int b);

}

public class App 
{
    public static void main(String[] args) {
        Sum sum = (int a, int b) -> a + b;
        System.out.println(sum.sumOfTwoNumbers(3,5));
        Sum multiply = (int a, int b) -> a * b;
        System.out.println(multiply.sumOfTwoNumbers(3,5));


    }

}
