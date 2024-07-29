package com.dsa.striver.recursions;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int n =3;
        List<Integer> arr = List.of(5, 2, 1);
        List<Integer> sumOfSubset = subsetSums(arr,n);
        sumOfSubset.forEach((s)->System.out.print(s+", "));
    }

    private static List<Integer> subsetSums(List<Integer> arr, int n) {
        List<Integer> resultSum = new ArrayList<>();
        dfs(arr,0,resultSum,new ArrayList<Integer>());
        return resultSum;
    }

    private static void dfs(List<Integer> arr, int index, List<Integer> resultSum, ArrayList<Integer> list) {
        if(index>=arr.size()){
            int sum = list.stream().mapToInt(i->i).sum();
            resultSum.add(sum);
            return;
        }
        dfs(arr,index+1,resultSum,list);
        list.add(arr.get(index));
        dfs(arr,index+1,resultSum,list);
        list.remove(list.size()-1);
    }
}
