package com.dsa.striver.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","mango","grapes","orange");

        List<String> upperCaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<String> lowerCaseList = list.stream()
                        .map(String::toLowerCase)
                        .collect(Collectors.toList());

        upperCaseList
                .stream()
                .forEach((s) -> System.out.print(s+" "));

        System.out.println();

        upperCaseList
                .stream()
                .forEach((s) -> System.out.print(s+" "));
    }
}
