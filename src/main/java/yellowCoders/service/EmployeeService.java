package yellowCoders;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {
    public static void main(String[] args) {
        EmployeeDatabase empDb = new EmployeeDatabase();
        List<Employee> empList = empDb.getEmployees();

        //Find Number of males and females
        Map<String,Long> genderCount = empList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("1. genderCount : "+genderCount);

        //AvgSalary
        Map<String,Double> avgSalary = empList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("2. Avg Salary : "+ avgSalary);



    }
}
