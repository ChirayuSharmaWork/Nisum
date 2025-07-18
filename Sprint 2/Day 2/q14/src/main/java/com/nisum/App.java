package com.nisum;

import com.nisum.model.Address;
import com.nisum.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(101,"11", "John", "Doe", "MALE", "IT", 60000, Optional.of("john.doe@example.com"), Optional.of(new Address("New York", "USA"))),
                new Employee(102,"234", "Alice", "Smith", "FEMALE", "HR", 50000, Optional.of("alice.smith@example.com"), Optional.of(new Address("Chicago", "USA"))),
                new Employee(103,"1234", "Bob", "Brown", "MALE", "HR", 70000, Optional.empty(), Optional.empty()),
                new Employee(104,"1", "Lily", "White", "FEMALE", "IT", 80000, Optional.of("lily.white@example.com"), Optional.of(new Address("London", "UK"))),
                new Employee(105,"421", "Mike", "Green", "MALE", "Marketing", 45000, Optional.empty(), Optional.of(new Address("Sydney", "Australia"))),
                new Employee(106,"32", "Sara", "Connor", "FEMALE", "Finance", 72000, Optional.of("sara.connor@example.com"), Optional.empty()),
                new Employee(107,"98", "Chirag", "Mehta", "MALE", "HR", 48000, Optional.of("chirag.mehta@example.com"), Optional.of(new Address("Delhi", "India"))),
                new Employee(108,"100", "David", "Lee", "MALE", "IT", 55000, Optional.of("david.lee@example.com"), Optional.of(new Address("Berlin", "Germany"))),
                new Employee(109,"1000", "Nina", "Roy", "FEMALE", "Marketing", 61000, Optional.empty(), Optional.empty()),
                new Employee(110,"2", "Amit", "Shah", "MALE", "Finance", 73000, Optional.of("amit.shah@example.com"), Optional.of(new Address("Mumbai", "India")))
        );


        List<Employee> employeesData = employees.stream().map(
                e -> e.getFirstName()
                + " " + e.getLastName() + " email "
                + e.getEmail().ifPresentOrElse(
                        (email -> return email,
                        () -> return " NO email"
                );


        ).collect.Collector(tolist)

    }

}

