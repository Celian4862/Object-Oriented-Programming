package com.example;

public class Main {
    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster(10);
        roster.addEmployee(new HourlyEmployee(1, new Name("Doe", "John"), new Date(1997, 1, 15), new Date(2024, 5, 10), 12.3f, 1.5));
        // roster.addEmployee(new HourlyEmployee(1, new Name("Doe", "John"), new Date(1997, 1, 15), new Date(2024, 5, 10), 12.3f, 1.5));
        roster.addEmployee(new CommissionEmployee(2, new Name("Doe", "John"), new Date(1997, 1, 15), new Date(2024, 5, 10), 100.15));
        roster.addEmployee(new BasePlusCommissionEmployee(3, new Name("Doe", "John", "Pear"), 100.2, 50.0));
        roster.displayAllEmployees();
        roster.removeEmployee(1);
        roster.displayAllEmployees();
        roster.setEmployee(new Employee(4, "Doe", "John", "Pear", 2004, 11, 04), 1);
        roster.displayAllEmployees();
    }
}