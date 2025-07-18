package com.nisum;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File("/Users/chirayusharma/Desktop/Nisum/Sprint 3/Day 1/q5/src/main/java/com/nisum/Numbers.txt"))) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    System.out.println(number);
                } else {
                    scanner.next(); // skip invalid input
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
