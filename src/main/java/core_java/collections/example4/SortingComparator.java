package core_java.collections.example4;
import core_java.collections.Customer;

import java.util.Comparator;

public class SortingComparator extends Customer{
    public Comparator<Customer> NameComparatore = new Comparator<Customer>(){

        @Override
        public int compare(Customer c1, Customer c2) {
            return c1.getName().compareTo(c2.getName());
        }
    };
}
