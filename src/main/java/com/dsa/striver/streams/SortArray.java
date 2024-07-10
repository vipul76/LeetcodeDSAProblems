package com.dsa.striver.streams;

import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        List<Integer> list = List.of(13,9,99,5,24,6);
        sortArray(list);
    }

    private static void sortArray(List<Integer> list) {
        list.stream()
                .sorted((a,b)->b-a)
                .forEach((s)->System.out.print(s+"  "));
    }
}
