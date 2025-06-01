package com.nisum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class App
{
    public static void main(String[] args) {

        Function<List<Integer>,List<Integer>> removeEven = f -> {
            f.removeIf(getIntegerPredicate());
            return f;
        };
        List<Integer> numbers1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        List<Integer> numbers2 = new ArrayList<>(List.of(11,12,13,14,15,16,17,18,19,20));
        List<Integer> filtered = removeEven.apply(numbers1);
        System.out.println("By using Function<T,R> ");
        for(Integer i : filtered){
            System.out.println(i);
        }

        BiFunction<List<Integer>,List<Integer>,List<Integer>> removeEvenAndCombineList = (f1,f2) -> {
            f1.removeIf(getIntegerPredicate());
            f2.removeIf(getIntegerPredicate());
            f1.addAll(f2);
            Collections.sort(f1);
            return f1;
        };
        List<Integer> filteredNew = removeEvenAndCombineList.apply(numbers1,numbers2);
        System.out.println("By using BiFunction<T,U,R>");
        for(Integer i : filteredNew){
            System.out.println(i);
        }



    }

    private static Predicate<Integer> getIntegerPredicate() {
        return s -> s % 2 == 0;
    }

}
