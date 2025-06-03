package com.nisum;


interface  Interface1 {
    default void run(){
        System.out.println("Interface 1 is running ");
    }
}

class Interface3 implements Interface1{
    @Override
    public void run(){
        Interface1.super.run();
    }

}

public class App
{
    public static void main(String[] args) {

        Interface3 interface3 = new Interface3();
        interface3.run();

    }

    }


