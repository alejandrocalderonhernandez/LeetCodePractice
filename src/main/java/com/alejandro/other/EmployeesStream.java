package com.alejandro.other;

import java.util.Comparator;
import java.util.List;

public class EmployeesStream {

    public static List<String> stream(List<Employee> list) {
        return list.stream()
                .filter(e -> e.salary > 50000.00)
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .map(Employee::name)
                .toList();
    }


    public record Employee(String name, double salary){}

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Ana", 60_000),
                new Employee("Pedro", 90_000),
                new Employee("Luis", 40_000),
                new Employee("María", 75_000)
        );

        System.out.println(stream(employees));
    }
}



