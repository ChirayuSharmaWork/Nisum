package com.nisum;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        System.out.println("Enter your age : ");
        try(Scanner scanner = new Scanner(System.in)){
            Integer age = scanner.nextInt();
            validateAge(age);
            System.out.println("Age is verified");
        }catch (InvalidAgeException ex){
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }


    public static void validateAge(Integer age){
        if(age <= 0){
            throw new InvalidAgeException("Age is less then or equal to 0");
        }

    }
}
