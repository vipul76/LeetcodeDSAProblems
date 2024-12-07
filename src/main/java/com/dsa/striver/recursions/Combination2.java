package com.dsa.striver.recursions;

import java.util.*;
import java.util.stream.Collectors;

public class Combination2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(candidates);
        List<List<Integer>> combinations = combinationSum2(candidates,target);
        combinations.forEach((s)-> {
            s.forEach((i)-> System.out.print(i+","));
            System.out.println();
        });
    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        findCombinations(0,target,candidates,resultList,new ArrayList<>());

        return resultList.stream().toList();
    }
    private static void findCombinations(int index, int target,int[] candidates, List<List<Integer>> resultList, List<Integer> list) {
        if(target<0) return;
        if(target==0){
            resultList.add(new ArrayList<>(list));
            return;
        }
        for (int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;

            list.add(candidates[i]);
            findCombinations(index+1,target-candidates[i], candidates, resultList, list);
            list.remove(list.size()-1);
        }
    }
}
