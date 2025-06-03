package com.nisum;


interface  Interface1 {
    default void run(){
        System.out.println("Interface 1 is running ");
    }
}
interface  Interface2 {
    default void run(){
        System.out.println("Interface 2 is running ");
    }
}

class Interface3 implements Interface1,Interface2{
    @Override
    public void run(){
        System.out.println("This is Interface 3 Running");
    }

}

public class App
{
    public static void main(String[] args) {

        Interface3 interface3 = new Interface3();
        interface3.run();

    }

    }


