package com.nisum;

import com.nisum.model.Address;
import com.nisum.model.Employee;
import java.util.List;
import java.util.Optional;


public class App {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(101, "John", "Doe", "MALE", "IT", 60000, Optional.of("john.doe@example.com"), Optional.of(new Address("New York", "USA"))),
                new Employee(102, "Alice", "Smith", "FEMALE", "HR", 50000, Optional.of("alice.smith@example.com"), Optional.of(new Address("Chicago", "USA"))),
                new Employee(103, "Bob", "Brown", "MALE", "Finance", 70000, Optional.empty(), Optional.empty()),
                new Employee(104, "Lily", "White", "FEMALE", "IT", 80000, Optional.of("lily.white@example.com"), Optional.of(new Address("London", "UK"))),
                new Employee(105, "Mike", "Green", "MALE", "Marketing", 45000, Optional.empty(), Optional.of(new Address("Sydney", "Australia"))),
                new Employee(106, "Sara", "Connor", "FEMALE", "Finance", 72000, Optional.of("sara.connor@example.com"), Optional.empty()),
                new Employee(107, "Chirag", "Mehta", "MALE", "HR", 48000, Optional.of("chirag.mehta@example.com"), Optional.of(new Address("Delhi", "India"))),
                new Employee(108, "David", "Lee", "MALE", "IT", 55000, Optional.of("david.lee@example.com"), Optional.of(new Address("Berlin", "Germany"))),
                new Employee(109, "Nina", "Roy", "FEMALE", "Marketing", 61000, Optional.empty(), Optional.empty()),
                new Employee(110, "Amit", "Shah", "MALE", "Finance", 73000, Optional.of("amit.shah@example.com"), Optional.of(new Address("Mumbai", "India")))
        );

        String fullName = employees.stream().findFirst().map(e -> e.getFirstName() + ' ' + e.getLastName()).orElse("");

        System.out.println(fullName);



    }

}

