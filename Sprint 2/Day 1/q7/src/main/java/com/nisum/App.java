package com.nisum;
import java.util.List;
import java.util.function.Consumer;


public class App
{
    public static void main(String[] args) {

        Consumer<List<String>> upperCase = list -> {
            list.forEach(s -> System.out.println(s.toUpperCase()));
        };

        List<String> names = List.of("honey","money","ahana");
        upperCase.accept(names);

    }

    }


