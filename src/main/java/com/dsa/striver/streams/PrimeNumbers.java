package com.dsa.striver.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> primeList = primeNumbers(list);
        primeList.stream().forEach((s)->System.out.print(s+ " "));
    }

    private static List<Integer> primeNumbers(List<Integer> list) {
        return list.stream()
                .filter((num)->{
                    if(num==0 || num==1) return false;
                    for (int i=2;i<=num/2;i++){
                        if(num%i==0) return false;
                    }
                    return true;
                })
                .collect(Collectors.toList());
    }
}
