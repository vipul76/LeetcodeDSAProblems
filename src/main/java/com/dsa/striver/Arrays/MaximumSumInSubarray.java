package com.dsa.striver.Arrays;

public class MaximumSumInSubarray {
    public static void main(String[] args) {
        int[] nums = {4,3,1,5,6};
        long sum = pairWithMaxSumO(nums);
        System.out.println(sum);
    }

    private static long pairWithMaxSumO(int[] nums) {
        long max = Integer.MIN_VALUE;
        long firstSmall = Integer.MAX_VALUE,
                secondSmall = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            long sum = 0;
            if(firstSmall>nums[i]){
                secondSmall = firstSmall;
                firstSmall = nums[i];
            }
            else if(secondSmall>nums[i]){
                secondSmall = nums[i];
            }

            if(i>0){
                sum = firstSmall+secondSmall;
                max = Math.max(max,sum);
            }

        }
        return max;
    }

    //Brute force approach correct
    // TC : O(n^2) SC : O(1)
    private static long pairWithMaxSumBF(int[] nums) {
        long max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            long first_small = Integer.MAX_VALUE,
                    second_small = Integer.MAX_VALUE;
            long sum=0;
            for(int j=i;j<nums.length;j++){
                if (first_small>nums[j]){
                    second_small = first_small;
                    first_small = nums[j];
                } else if (second_small>nums[j]) {
                    second_small = nums[j];
                }
                sum = first_small+second_small;
                max = Integer.max((int)sum,(int)max);
            }
        }
        return max;
    }
}