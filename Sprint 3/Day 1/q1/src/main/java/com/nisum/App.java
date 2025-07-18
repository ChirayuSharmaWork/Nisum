package com.nisum;


class Calculator{
public static Integer divide(Integer a ,Integer b) throws  ArithmeticException{
    return  a / b;
}
}

public class App 
{
    public static void main( String[] args )
    {
        try{
            System.out.println(Calculator.divide( 54,0));
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }
    }
}
