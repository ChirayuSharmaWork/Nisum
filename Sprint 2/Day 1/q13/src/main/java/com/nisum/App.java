package com.nisum;


interface  maths{
    static int square(int x){
        return x * x;
    }
}

public class App
{
    public static void main(String[] args) {

        System.out.println(maths.square(10));

    }

    }


