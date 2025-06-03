package com.nisum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByLength implements Comparator<String>{

    @Override
    public int compare(String s1 , String s2){
        return Integer.compare(s1.length(),s2.length());
    }
}

public class App
{
    public static void main(String[] args) {
        List<String> s1 = new ArrayList<>(List.of("random","honey","money"));
        Collections.sort(s1,new SortByLength());
        for(int i = 0; i < s1.size(); i++) {
            System.out.println(s1.get(i));
        }


    }

    }


