package com.nisum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class App {
    public static void main(String[] args) {

        List<Integer> names = List.of(2, 3, 4, 5);
        Consumer<Integer> doubleList = s -> System.out.println(s*2);

        for (int a = 0; a < names.size(); a++) {
            doubleList.accept(names.get(a));
        }


    }

}

