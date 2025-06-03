package com.nisum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class App {
    public static void main(String[] args) {

        List<String> names = List.of("ahana", "Chirayu", "adeeb", "lizard");
        Consumer<String> printList = s -> System.out.println(s);

        for (int a = 0; a < names.size(); a++) {
            printList.accept(names.get(a));
        }


    }

}

