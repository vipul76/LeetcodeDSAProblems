package core_java.collections;

import java.util.ArrayList;
import java.util.List;

public class DataBaseRepo {
    private final List<Customer> list = new ArrayList<>();

    public DataBaseRepo(){
        initData();
    }
    private void initData(){
        list.add(new Customer(1,"Vipul","Pune"));
        list.add(new Customer(2,"Nilesh","Ranchi"));
        list.add(new Customer(3,"Suresh","Bhopal"));
        list.add(new Customer(4,"Dinesh","Chennai"));
        list.add(new Customer(5,"Priyesh","Kolkata"));
    }

    public List<Customer> getCustomers(){
        return new ArrayList<>(list);
    }
    public void resetData(){
        list.clear();
        initData();
    }
}
