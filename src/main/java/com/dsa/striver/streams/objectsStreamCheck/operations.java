package com.dsa.striver.streams.objectsStreamCheck;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface operations {
    List<Employee> getByHRDept(List<Employee> empList);

    Map<Employee,String> getByDept(List<Employee> empList);

    Optional<Employee> findHighestSalary(List<Employee> empList);

    Optional<Employee> findSecondHighestPaidEmployee(List<Employee> employeeList);
}
