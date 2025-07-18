package com.nisum;



import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {

    double startExc,endExc;
    @Before("execution(* com.nisum.TextEditor.greetings())")
    public void startExecutionTime(){
        startExc = System.nanoTime();

    }

    @After("execution(* com.nisum.TextEditor.greetings())")
    public void endExecutionTime(){
        endExc = System.nanoTime();
        System.out.println("Total execution time is " + (endExc - startExc));

    }
}
