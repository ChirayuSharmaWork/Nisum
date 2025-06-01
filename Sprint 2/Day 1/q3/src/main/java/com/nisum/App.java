package com.nisum;


//With annotation
@FunctionalInterface
interface Sum{
    int sumOfTwoNumbers(int a, int b);
    int sumOfThreeNumbers(int a, int b, int c);
}
// this interface is giving error

// Without annotation
interface difference {
    int differenceOfNumber(int a ,int b);
    int differenceOfThreeNumbers(int a, int b, int c);
}
// it will not give error if we don't use  Functional Interface annotation

public class App 
{
    public static void main(String[] args) {

    }

}
