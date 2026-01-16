package core_java.collections.example3;

import core_java.collections.Customer;

import java.util.*;

public class Example3Main {
    public static void main(String[] args) {
        Example3Main obj = new Example3Main();

        ArrayList<Customer> arrayList = new ArrayList<>();
        arrayList.add(new Customer(1, "vipul", "pune"));
        arrayList.add(new Customer(2, "Pihu", "Bangalore"));

        System.out.print("checking Arraylist :");
        ArrayList<Customer> arrayListResult = obj.add(arrayList);
        arrayListResult.forEach(System.out::println);
        System.out.println("=====================================");

        List<Customer> list = new ArrayList<>();
        list.add(new Customer(3, "Deepika", "Indore"));
        list.add(new Customer(4, "vipul", "pune"));

        System.out.print("Checking list : ");
        List<Customer> listResult = obj.add(list);
        listResult.forEach(System.out::println);

        List<Customer> linkedList = new LinkedList<>();
        linkedList.add(new Customer(5, "Rathode", "Indore"));
        linkedList.add(new Customer(6, "Nilesh", "pune"));
        List<Customer> linkedlistResult = obj.add(linkedList);
        linkedlistResult.forEach(System.out::println);

    }

    public ArrayList<Customer> add(ArrayList<Customer> customerArrayList) {
        System.out.println("overloaded arraylist add method");
        return new ArrayList<>(customerArrayList);
    }
    public List<Customer> add(List<Customer> customerList){
        System.out.println("overloaded list add method");
        return new ArrayList<>(customerList);
    }
}
