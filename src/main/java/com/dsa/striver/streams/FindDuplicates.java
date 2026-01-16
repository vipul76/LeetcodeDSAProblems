package com.dsa.striver.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,5,8,3,5,2,15);

       List<Integer> duplicates = list.stream()//Converting list to stream
               .collect(Collectors.groupingBy(e->e,Collectors.counting()))//Grouping element bast on key value pair
               //where key -> element and value -> count
               .entrySet()//as we are having map as key value so we need to iterate it to get the duplicates
               .stream()//now iteration is done with the streams
               .filter(entry->entry.getValue()>1)// Filtering the key based on count
               .map(Map.Entry::getKey)//Transforming the stream of map to the stream of keys
               .toList();

        System.out.println(duplicates);
    }
}
