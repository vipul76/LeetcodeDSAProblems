package com.dsa.striver.recursions;

import java.util.ArrayList;
import java.util.List;
//TC : O(2^N)
public class Subset {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> subsetRes = subsets(nums);
        for (List<Integer> subset : subsetRes) {
            System.out.print("{");
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i));
                if (i < subset.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("} ");
        }
    }

    static List<List<Integer>> resultSet = new ArrayList<>();
    private static List<List<Integer>> subsets(int[] nums) {
        resultSet.clear();
        List<Integer> list  = new ArrayList<>();
        backTrack(nums,0, list);
        return resultSet;
    }

    private static void backTrack(int[] nums, int index, List<Integer> list) {
        if(index==nums.length){
            resultSet.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        backTrack(nums,index+1,list);
        list.remove(list.size()-1);
        backTrack(nums,index+1,list);
    }
}
