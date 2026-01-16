package com.dsa.striver.streams.objectsStreamCheck;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OperationsImpl implements operations{
    @Override
    public List<Employee> getByHRDept(List<Employee> employeeList) {
        return employeeList
                .stream()
                .filter(emp->"HR".equalsIgnoreCase(emp.getDepartment()))
                .collect(Collectors.toList());
    }

    @Override
    public Map<Employee, String> getByDept(List<Employee> empList) {
        return empList.stream()
                .collect(Collectors.toMap(emp->emp,Employee::getDepartment));
    }

    @Override
    public Optional<Employee> findHighestSalary(List<Employee> empList) {
        if(empList==null || empList.isEmpty()){
            System.out.println("Employee list is null or empty please add employee details");
            return Optional.empty();
        }
        return empList
                .stream()
                .max(Comparator.comparing(Employee::getSalary));
    }

    @Override
    public Optional<Employee> findSecondHighestPaidEmployee(List<Employee> employeeList) {
        if(employeeList==null || employeeList.size()<2){
            System.out.println("Employee list has fewer employee details");
            return Optional.empty();
        }
        return employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
    }
}
