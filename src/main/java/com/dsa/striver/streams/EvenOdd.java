package com.dsa.striver.streams;

import java.util.Arrays;
import java.util.List;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenList = evenNumbers(list);
        evenList.stream().forEach((s)->System.out.print(s+ " "));
        System.out.println();
        List<Integer> oddList = oddNumbers(list);
        oddList.stream().forEach((s)->System.out.print(s+ " "));
    }

    private static List<Integer> oddNumbers(List<Integer> list) {
        return list
                .stream()
                .filter(num -> num%2!=0)
                .toList();
    }

    private static List<Integer> evenNumbers(List<Integer> list) {
        return list
                .stream()
                .filter(num -> num%2==0)
                .toList();
    }

}
