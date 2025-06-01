package com.nisum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class App
{
    public static void main(String[] args) {

        Predicate<String> startsWithJ = (String val) -> val.startsWith("J");
        List<String> names = new ArrayList<>(List.of("Jerry", "Jack", "Ronyy", "Money"));


        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            if (!startsWithJ.test(iter.next())) {
                iter.remove();
            }
        }

        // List with Names Starting with letter J
        for (String name : names){
            System.out.println(name);
        }

    }

}
