package com.nisum;


@FunctionalInterface
interface Sum{
    int sumOfTwoNumbers(int a, int b);
}


public class App 
{
    public static void main(String[] args) {

        Sum add = (int a, int b) -> a + b;
        System.out.println(add.sumOfTwoNumbers(1,2));

    }

}
