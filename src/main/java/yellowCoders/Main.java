package yellowCoders;


import yellowCoders.service.*;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmpServiceImpl();
        NumberService numberService = new NumberServiceImpl();
        StringService stringService = new StringServiceImpl();

        System.out.println("===========Employee Object Methods============");
        System.out.println("1. Gender Count : "+ employeeService.GenderCount());
        System.out.println("2. Avg Salary : "+ employeeService.avgSalary());
        System.out.println("3. Highest Salary : "+ employeeService.highestSalary());
        System.out.println("4. Second Highest Salary : "+ employeeService.secondHighestSalary());
        System.out.println("===========***********************============");

        System.out.println("===========Number Methods============");
        System.out.println("1. Even number and odd number : "+ numberService.evenOdd());
        System.out.println("2. Duplicate Numbers : "+ numberService.duplicateNumber());
        System.out.println("3. Number Starting with 1 : "+numberService.startsWith1());
        System.out.println("===========**************============");

        System.out.println("===========String Methods============");
        System.out.println("1. Remove all occurrence of a given character : "+ stringService.removeOccurence("java interview",'a'));
        System.out.println("2. Find Special Characters : "+ stringService.specialCharacter("Hello, World! 123 @#"));
        System.out.println("3. Concatenate list of string in a single string : "+stringService.concatenateString());
        System.out.println("4. First Non repeating character : "+ stringService.firstNonRepeatingCharacter("iindiiia"));
        System.out.println("===========**************============");
    }
}
