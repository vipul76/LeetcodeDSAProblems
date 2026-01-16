package codeDecode;

import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {
        Employee emp4 = new Employee();
        Employee emp5 = new Employee(1,"vipul",29,"M",25000L);

        System.out.println("shallow copy : "+ (emp4==emp5));
        System.out.println("Deep copy : "+ (emp4.equals(emp5)));

                Employee emp1 = new Employee(101, "Alice");
                Employee emp2 = new Employee(101, "Alice"); // same values
                Employee emp3 = new Employee(102, "Bob");   // different

                // 1. equals() tests
                System.out.println("emp1.equals(emp2): " + emp1.equals(emp2)); // true
                System.out.println("emp1.equals(emp3): " + emp1.equals(emp3)); // false

                // 2. hashCode() test
                System.out.println("emp1.hashCode(): " + emp1.hashCode());
                System.out.println("emp2.hashCode(): " + emp2.hashCode()); // should match emp1
                System.out.println("emp3.hashCode(): " + emp3.hashCode());

                // 3. Test in HashSet
                HashSet<Employee> employeeSet = new HashSet<>();
                employeeSet.add(emp1);
                employeeSet.add(emp2); // will not be added if equals + hashCode are correct
                employeeSet.add(emp3);

                System.out.println("HashSet contents:");
                for (Employee e : employeeSet) {
                    System.out.println(e);
                }

                // 4. Test contains
                System.out.println("HashSet contains emp2: " + employeeSet.contains(emp2)); // true
            }
        }
