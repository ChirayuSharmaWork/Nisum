package com.nisum;
import java.util.List;
import java.util.function.Consumer;



@FunctionalInterface
interface Calculator{
    abstract int sum(int a,int b);

    default int difference(int a, int b){
        return a -b;
    }
    default int Multiply(int a, int b){
        return a  * b;
    }
    default int Divison(int a, int b){
        return a / b;
    }
}

public class App
{
    public static void main(String[] args) {

    }

    }


