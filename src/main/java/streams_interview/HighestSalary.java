package streams_interview;

import java.util.Comparator;
import java.util.List;

public class HighestSalary {
    public static void main(String[] args) {
        EmployeeDatabase db = new EmployeeDatabase();
        List<Employee> employees = db.getEmployees();

        //way1 -> using reduce method  (If highest salary is same for 2 or more employees then it gives the last employee name)
        Employee highestSal = getHighestEmployeeSalary(employees);
        System.out.println("Highest Sal employees : "+ highestSal);

        //way2 -> using max function (more approachable way for finding the highest salary employee
        //(If highest salary is same for 2 or more employees than it gives the first employee name)
        Employee highestSalWay2 = getHighestEmployeeSalaryWay2(employees);
        System.out.println("Highest Salary employees way2: "+ highestSalWay2);

        //way3 -> Get all the list of employee whose salary is the highest among another employee and same for those list employees
        List<Employee> highestSalaryEmployeeList = getListOfHighestEmployeeSalary(employees);
        System.out.println("Highest Salary employees list are as below: ");
        highestSalaryEmployeeList.forEach(System.out::println);
    }

    private static Employee getHighestEmployeeSalary(List<Employee> employees) {
        return employees
                .stream()
                .reduce((emp1,emp2)-> emp1.getSalary() > emp2.getSalary()? emp1 : emp2)
                .orElseThrow(()-> new IllegalArgumentException("Employee list is empty : not found highest salary employee"));
    }

    private static Employee getHighestEmployeeSalaryWay2(List<Employee> employees) {
        return employees
                .stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(()-> new IllegalArgumentException("Employee list is empty : not found highest salary employee"));
    }

    private static List<Employee> getListOfHighestEmployeeSalary(List<Employee> employees) {
        double maxSalary = employees
                        .stream()
                        .mapToDouble(Employee::getSalary)
                        .max()
                        .orElse(0.0);
        return employees
                .stream()
                .filter(emp->emp.getSalary() == maxSalary)
                .toList();
        /*//The employees.stream().mapToDouble(Employee::getSalary).max() is executed repeatedly for each employee in the outer stream's filter.
        // This makes the code unnecessarily slow for larger datasets.

        return employees
                .stream()
                .filter(emp -> emp.getSalary() == employees
                        .stream()
                        .mapToDouble(Employee::getSalary)
                        .max()
                        .orElse(0.0))
                .toList();*/
    }
}
