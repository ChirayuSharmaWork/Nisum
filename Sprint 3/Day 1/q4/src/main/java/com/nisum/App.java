package com.nisum;


import java.io.IOException;
import java.io.UncheckedIOException;

public class App {

    public static void  legacyApi() throws IOException {
        throw new IOException();
    }

    public static void convertingCheckedToRuntime(){
        try{
            legacyApi();
        }catch (IOException ex){
            throw new UncheckedIOException("There is some exception",ex);
        }
    }


    public static void main(String[] args) {
            convertingCheckedToRuntime();
    }


}