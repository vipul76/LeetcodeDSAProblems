package core_java.collections.example4;

import core_java.collections.Customer;
import core_java.collections.DataBaseRepo;
import core_java.collections.example4.SortingComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();



        customers.sort(new SortingComparator().NameComparatore);
        customers.forEach(System.out::print);
    }
}
