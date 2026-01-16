package core_java.collections;


import java.util.HashSet;
import java.util.Set;

public class EmapMain {

    public static void main(String[] args) {
        Set<Emp> empSet = new HashSet<>();
        empSet.add(new Emp(1,"abc","pune"));
        empSet.add(new Emp(2,"qwerty","ranchi"));
        empSet.add(new Emp(1,"abc","pune"));
        empSet.add(new Emp(2,"qwerty","ranchi"));
        empSet.add(new Emp(2,"qwerty","ranchi"));
        empSet.add(new Emp(2,"qwerty","ranchi"));
        empSet.add(new Emp(2,"qwerty","ranchi"));
        empSet.add(new Emp(2,"qwerty","ranchi"));


        empSet.forEach(emp -> System.out.println("hashcode : "+empSet.hashCode() +", Exist : "+empSet.contains(emp)+ ", emp : "+emp));
    }
}
