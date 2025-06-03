package com.nisum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface  Sorter{
    List<String> sort(List<String> s);
}


public class App
{
    public static void main(String[] args) {

        Sorter sort = s -> {
            s.sort(Comparator.comparing(str->str.length()));
            return s;
        };
        List<String> names = new ArrayList<>(List.of("Chirayu","money","honey","ahan","mummy"));
        sort.sort(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }



    }

    }


