package com.dsa.striver.streams;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueElement {
    public static void main(String[] args) {
        List<Integer> list = List.of(13,9,99,5,24,6,13,9,99,5,24,6,13,9,99,5,24,6);
        List<Integer> uniqueNum = findUnique(list);
        uniqueNum
                .stream()
                .forEach((s) -> System.out.print(s+" "));
    }

    private static List<Integer> findUnique(List<Integer> list) {
        List<Integer> unique = list
                .stream()
                .distinct()
                .collect(Collectors.toList());
        return unique;
    }
}
