package com.dsa.striver.recursions;

import java.util.*;

public class SubsetSum2 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> subset = subsetsWithDup(nums);
        subset.forEach((s)->{
            System.out.print("{");
            s.forEach(i-> System.out.print(i+" "));
            System.out.print("}");
        });
    }

    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> resultList = new LinkedHashSet<>();
        dfs(nums,0,resultList,new ArrayList<Integer>());
        return resultList.stream().toList();
    }

    private static void dfs(int[] nums, int index, Set<List<Integer>> resultList, ArrayList<Integer> list) {
        if(index >= nums.length){
            resultList.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        dfs(nums,index+1,resultList,list);
        list.remove(list.size()-1);
        dfs(nums,index+1,resultList,list);
    }
}
