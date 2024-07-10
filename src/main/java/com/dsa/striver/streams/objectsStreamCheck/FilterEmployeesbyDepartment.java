package com.dsa.striver.streams.objectsStreamCheck;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEmployeesbyDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee("Alice", 30, 70000, "HR"),
                new Employee("Bob", 40, 80000, "Engineering"),
                new Employee("Charlie", 35, 60000, "HR")
        );
        //Filter Employees by Department
        List<Employee> hrEmpList = employeeList.stream()
                .filter(employee -> "HR".equals(employee.getDepartment()))
                .toList();
        hrEmpList.stream().forEach((s)->System.out.println(s));

        //Find Employee with the Highest Salary
        Employee highestSalEmp = employeeList.stream()
                .max((e1,e2)-> Double.compare(e1.getSalary(),e2.getSalary()))
                .get();
        System.out.println("Highest Salary Employee : "+highestSalEmp);

        //Average salary of employee
        double avgSalEmp = employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println("AvegSalEmp"+avgSalEmp);

        //Get Names of all Employees
        List<String> employeeNamesList = employeeList
                .stream()
                .map(e->e.getName())
                .collect(Collectors.toList());
        employeeNamesList.stream().forEach((s)->System.out.print(s+" "));

        //Group Employee by department
        Map<String,List<Employee>> mapDept = employeeList.stream()
                .collect(Collectors.groupingBy(e->e.getDepartment()));

        //Iterate mapDepartment
        /*mapDept.forEach((k,v)->{
            System.out.println("Department : "+k);
            v.stream().forEach((s)->System.out.println(s));
        });*/
        //using simple for loop for (Map.Entry<String,List<Employee>> entry : mapDept.entrySet())
        for (int i=0;i<mapDept.size();i++){
            System.out.println("Department : "+mapDept.keySet().toArray()[i]);
            mapDept.get(mapDept.keySet().toArray()[i]).stream().forEach((s)->System.out.println(s));
        }
        /*for (Map.Entry<String,List<Employee>> entry : mapDept.entrySet()){
            System.out.println("Department : "+entry.getKey());
            entry.getValue().stream().forEach((s)->System.out.println(s));
        }*/
    }
}
