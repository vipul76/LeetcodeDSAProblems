package com.dsa.striver.recursions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> combinations = combinationSum(candidates,target);
        combinations.forEach((s)-> {
            s.forEach((i)-> System.out.print(i+","));
            System.out.println();
        });
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();

        backTrack(0,target,candidates,resultList,list);
        return resultList;
    }

    private static void backTrack(int index, int target,int[] candidates, List<List<Integer>> resultList, List<Integer> list) {
        if(index==candidates.length){
            if(target==0){
                resultList.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[index]<=target){
            list.add(candidates[index]);
            backTrack(index,target-candidates[index],candidates,resultList,list);
            list.remove(list.size()-1);
        }
        backTrack(index+1,target,candidates,resultList,list);
    }


}
