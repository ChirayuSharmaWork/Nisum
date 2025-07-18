package com.nisum;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
        TextEditor texteditorbySetter = (TextEditor) context.getBean("texteditorbySetter");
        TextEditor texteditorbyConstructor = (TextEditor) context.getBean("texteditorbyConstructor");

        texteditorbySetter.greetings();
        texteditorbyConstructor.greetings();



    }
}
