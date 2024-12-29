package streams_interview;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {

    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1,"Kritika Sanon",35,"Female",50000),
                new Employee(2,"Akshay Kumar",49,"Male",100000),
                new Employee(3,"Salman Khan",45,"Male",120000),
                new Employee(4,"Deepika Padukone",37,"Female",150000),
                new Employee(5,"Alia  Bhat",30,"Female",30000),
                new Employee(6,"John Dhoe",30,"Male",50000),
                new Employee(7,"Jane Smith",25,"Female",20000),
                new Employee(8,"Mike Johnson",40,"Male",70000),
                new Employee(9,"Emily Davis",35,"Female",80000),
                new Employee(10,"Robert Brown",50,"Male",90000),
                new Employee(11,"Wamiqa",37,"Female",150000)
        );
    }
}
