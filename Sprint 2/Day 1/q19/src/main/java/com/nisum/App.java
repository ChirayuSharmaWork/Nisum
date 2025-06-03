package com.nisum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class App
{
    public static void main(String[] args) {

        Predicate<Integer> divisibleBy2 = s -> s%2 == 0;
        Predicate<Integer> divisibleBy3 = s -> s%3 == 0;
        Predicate<Integer> divisibleBy2And3 = divisibleBy2.and(divisibleBy3);
        Predicate<Integer> divisibleBy2Or3 = divisibleBy2.or(divisibleBy3);

        System.out.println("Divisible by 2 And 3");
        System.out.println(divisibleBy2And3.test(123));
        System.out.println(divisibleBy2And3.test(6));
        System.out.println(divisibleBy2And3.test(13));

        System.out.println("Divisible by 2 Or 3");
        System.out.println(divisibleBy2Or3.test(123));
        System.out.println(divisibleBy2Or3.test(6));
        System.out.println(divisibleBy2Or3.test(13));






    }

    }


