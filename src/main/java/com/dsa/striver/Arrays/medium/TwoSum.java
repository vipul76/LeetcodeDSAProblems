package com.dsa.striver.Arrays.medium;

import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};//{3,2,4};//{3,3};
        int target = 9;//6;
        int[] result = twoSumTP(nums,target);
        Arrays.stream(result).forEach((s)->System.out.print(s + " "));
    }

    //Using 2 pointer approach
    private static int[] twoSumTP(int[] nums, int target) {
        int n = nums.length;
        int[] result = {-1,-1};
        int i=0, j=n-1;
        Arrays.sort(nums);
        while (i<j){
            if(nums[i]+nums[j]==target){
                result[0]=i;
                result[j]=j;
                break;
            } else if (nums[i]+nums[j]<target) {
                i++;
            } else if (nums[i]+nums[j]>target) {
                j--;
            }
        }
        return result;
    }


    //Using Hashmap TC: O(n) SC: O(n)
    private static int[] twoSumB(int[] nums, int target) {
        int n = nums.length;
        int[] result = {-1,-1};
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i<n;i++){
            int search = target-nums[i];
            if(hm.containsKey(search)){
                result[0]=hm.get(search);
                result[1]=i;
            }
            hm.put(nums[i],i);
        }
        return result;
    }

    //Brute force O(n^2)
    private static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = {-1,-1};
        for(int i=0;i<len;i++){
            int search = target-nums[i];
            for (int j = i + 1;j<len;j++){
                if(search==nums[j]){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }
}
