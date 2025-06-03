package com.nisum;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class App
{
    public static void main(String[] args) {

     Function<List<String>, List<String>> filter = list -> {
         list.removeIf(s -> !s.startsWith("A"));
         return list;
     };

     List<String> names = new ArrayList<>(List.of("Chirayu","Ahana","Beauty"));
     filter.apply(names);
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }



    }

    }


