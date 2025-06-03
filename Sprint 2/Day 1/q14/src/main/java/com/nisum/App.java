package com.nisum;


interface  StringUtils{

    static boolean isNullOrEmpty(String s){
        return s == null || s.isEmpty();
    }

    static String capitalize(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }

}

public class App
{
    public static void main(String[] args) {

        String s1 = "";
        String s2 = "chIRAyu";
        System.out.println(StringUtils.isNullOrEmpty(s1));
        System.out.println(StringUtils.capitalize(s2));


    }

    }


