package com.dsa.striver.streams.objectsStreamCheck;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStream {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee("Alice", 30, 70000, "HR"),
                new Employee("Bob", 40, 80000, "Engineering"),
                new Employee("Charlie", 35, 60000, "HR")
        );

        operations operations = new OperationsImpl();

        //Example1 -> Filter Employees by HR Department
        System.out.println("(1)Print all hr dept emp :");
        List<Employee> hrEmpList = operations.getByHRDept(employeeList);
        hrEmpList.forEach(System.out::println);

        System.out.println("=====================================================");

        //Example2 -> Filter Employees list by Department wise
        Map<Employee, String> empListDeptWise = operations.getByDept(employeeList);
        System.out.print("(2)Employee list by department wise :");
        empListDeptWise.forEach((employee, department) ->
                System.out.println(department + " : " + employee));

        System.out.println("=====================================================");

        //Example3 -> Find Highest salary employee
        Optional<Employee> highestSalary = operations.findHighestSalary(employeeList);

        System.out.print("(3)Highest salary employee detail :");
        highestSalary.ifPresentOrElse(
                emp-> System.out.println(highestSalary),
                ()-> System.out.println("No employee found, unable to determine the highest salary")
        );

        System.out.println("=====================================================");

        //Example 4-> Find Second Highest salary employee
        Optional<Employee> secondHighestPaid = operations.findSecondHighestPaidEmployee(employeeList);
        secondHighestPaid.ifPresentOrElse(
                emp-> System.out.println("second Highest Paid Employey : "+secondHighestPaid),
                ()-> System.out.println("Fewer employee, not able to determine second highest salary")
        );
    }
}
