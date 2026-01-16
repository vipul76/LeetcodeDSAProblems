package yellowCoders.service;

import codeDecode.Employee;
import yellowCoders.EmployeeDatabase;

import java.util.*;
import java.util.stream.Collectors;

public class EmpServiceImpl implements EmployeeService{

    EmployeeDatabase empDb = new EmployeeDatabase();
    List<Employee> empList = empDb.getEmployees();

    @Override
    public Map<String, Long> GenderCount() {
        return empList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    }

    @Override
    public Map<String, Double> avgSalary() {
        return empList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
    }

    //Double.compare(emp.getSalary(), highestSal) == 0
    @Override
    public List<String> highestSalary() {
        double highestSal = empList
                .stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElseThrow(() -> new NoSuchElementException("No Employee found"));

        return empList
                .stream()
                .filter(emp->Double.compare(emp.getSalary(), highestSal)==0)
                .map(Employee::getName)
                .collect(Collectors.toList());

        /*return empList
                .stream()
                .filter(emp -> emp.getSalary()==highestSal)
                .map(Employee::getName)
                .collect(Collectors.toList());*/
    }

    @Override
    public String secondHighestSalary() {
        double highestSalary = empList
                .stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElseThrow(() -> new NoSuchElementException("No employee found"));

        return empList
                .stream()
                .filter(emp-> emp.getSalary()<highestSalary)
                .max(Comparator.comparingDouble(Employee::getSalary))
                .map(Employee::getName)
                .orElseThrow(()-> new NoSuchElementException("No second highest employee found"));
    }

   // @Override
    public Employee secondHighestSalaryMyApproach() {
        Employee maxSalEmp = empList
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(()->new NoSuchElementException("No Employees found to get Highest salary"));

        return empList
                .stream()
                .filter(emp->emp.getSalary()!= maxSalEmp.getSalary())
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(()->new NoSuchElementException("No Employees found to get second highest salary"));
    }


}
