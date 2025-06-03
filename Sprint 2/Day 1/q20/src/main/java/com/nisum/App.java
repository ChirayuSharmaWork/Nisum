package com.nisum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class App
{
    public static void main(String[] args) {

        Supplier<Double> generateRandomNumbers = () -> Math.random();

        System.out.println(generateRandomNumbers.get());
        System.out.println(generateRandomNumbers.get());
        System.out.println(generateRandomNumbers.get());
        System.out.println(generateRandomNumbers.get());
        System.out.println(generateRandomNumbers.get());

    }

    }


