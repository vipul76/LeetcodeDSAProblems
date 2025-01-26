package core_java.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Object> l1 = new ArrayList<>();
        l1.add(10);
        l1.add('A');
        System.out.println(l1 instanceof Serializable);
        System.out.println(l1 instanceof Cloneable);
        System.out.print("Random Access check for the  ArrayList : ");
        System.out.println(l1 instanceof RandomAccess);
        LinkedList<Object> l2 = new LinkedList<>();
        System.out.print("Random Access check for the  LinkedList : ");
        System.out.println(l2 instanceof RandomAccess);

    }
}
