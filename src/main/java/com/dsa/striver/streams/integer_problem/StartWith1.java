package com.dsa.striver.streams.integer_problem;

import java.util.List;
import java.util.stream.Collectors;

public class StartWith1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(11,18,20,24,85,1,44,3,873178);
        List<Integer> startWith1 = list.stream()
                        .filter(num->String.valueOf(num).startsWith("1"))
                                .toList();
        System.out.println(startWith1);
        //startsWith,contains,endswith
    }
}
