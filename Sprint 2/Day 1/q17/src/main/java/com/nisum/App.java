package com.nisum;

import java.util.function.Function;


interface StringUtils{
    static String toUpperCase(String s){
        return s.toUpperCase();
    }
}


public class App
{
    public static void main(String[] args) {

        String s = "lowercase";
        Function<String,String> upperCase = StringUtils::toUpperCase;
        s = upperCase.apply(s);
        System.out.println(s);


    }

    }


