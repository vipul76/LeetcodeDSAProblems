package com.dsa.striver.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {



    public static void main(String[] args) {
        //int[] nums = {2,2,1,1,1,2,2};
        int[] nums = {2,3,3};
        //int[] nums = {5};
        int majority = majorityElementB(nums);
        System.out.println(majority);
    }

    // Best way for Pattern matching problem TC : O(1) SC : O(1)
    // Boyre- Moore Vooting algorithm
    private static int majorityElementB(int[] nums) {
        int candidate=0;
        int count=0;
        int len = nums.length;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        count = 0;
        for(int num : nums){
            if(num == candidate)
                count++;
        }
        if(count >= nums.length/3.0)
            return candidate;
        System.out.println("No majority element found");
        return -1;
    }

    // Using HashMap  TC : O(1) SC : O(n)
    private static int majorityElementO(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0 ;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int count = hm.get(nums[i]);
                hm.put(nums[i],count+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++) {
            int key = nums[i];
            int value = hm.get(key);
            if (value >= Math.ceil(nums.length / 2.0)) {
                return key;
            }
        }
        System.out.println("No majority element found");
        return -1;
    }

    //Brute Force approach  O(N^2)
    private static int majorityElementBF(int[] nums) {
        int arrlen = nums.length;
        int val = (int)Math.ceil(arrlen/2.0);
        System.out.println("arrlen : " + arrlen);
        System.out.println(val);
        if(arrlen<=1) return arrlen;
        for(int i=0;i<arrlen;i++){
            int count = 0;
            for(int j=0;j<arrlen;j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            if(count >= val) return nums[i];
        }
        System.out.println("No Majority element found");
        return 0;
    }
}
