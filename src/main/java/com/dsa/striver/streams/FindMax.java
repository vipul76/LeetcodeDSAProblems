package com.dsa.striver.streams;

import java.util.List;
import java.util.Optional;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = List.of(13,9,99,5,24,6);
        int maxNum = findMax(list);
        System.out.println(maxNum);
    }

    private static int findMax(List<Integer> list) {
        Optional<Integer> max = list.stream()
                .max((a,b)->Integer.compare(a,b));
        return max.orElseThrow(()->new RuntimeException("List is empty"));
    }
}
