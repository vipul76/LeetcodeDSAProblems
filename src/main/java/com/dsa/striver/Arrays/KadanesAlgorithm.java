package com.dsa.striver.Arrays;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArrayBF(nums);
        System.out.println(result);
    }
    //Brute Force
    private static int maxSubArrayBF(int[] nums){
        int n= nums.length;
        long max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            long sum = 0;
            for(int j=i;j<n;j++){
                sum = sum+nums[j];
                if(max<sum){
                    max = sum;
                }
            }
        }
        return (int)max;
    }

    // optimal
    private static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(max<sum){
                max = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
