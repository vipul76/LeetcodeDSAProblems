package streams_interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleAndFemaleAndAvgSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"John Dhoe",30,"Male",50000),
                new Employee(2,"Jane Smith",25,"Female",20000),
                new Employee(3,"Mike Johnson",40,"Male",70000),
                new Employee(4,"Emily Davis",35,"Female",80000),
                new Employee(5,"Robert Brown",50,"Male",90000)
        );

        Map<String, Long> genderCount =
                employees
                        .stream()
                        .collect(Collectors
                                .groupingBy(Employee::getGender,
                                        Collectors.counting()));

        Map<String,Double> avgSalary =
                employees
                        .stream()
                        .collect(Collectors
                                .groupingBy(Employee::getGender,
                                        Collectors.averagingLong(Employee::getSalary)));

        System.out.println("GenderCount" + genderCount);
        System.out.println("Avg Salary" + avgSalary);
    }
}
