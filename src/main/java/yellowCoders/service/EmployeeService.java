package yellowCoders.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

        //Find Number of males and females
        Map<String,Long> GenderCount();

        //AvgSalary
        Map<String,Double> avgSalary();


        List<String> highestSalary();

        String secondHighestSalary();



}
