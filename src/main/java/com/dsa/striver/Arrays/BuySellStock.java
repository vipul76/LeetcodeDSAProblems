package com.dsa.striver.Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BuySellStock {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int profit = maxProfit(nums);
        System.out.println(profit);
    }

    /*private static int maxProfitStream(int[] nums) {
        Arrays.stream(nums)
                .map()
    }*/

    private static int maxProfit(int[] nums) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i=0;i<nums.length;i++){
            min = Integer.min(min,nums[i]);
            maxProfit = Integer.max(maxProfit,nums[i]-min);
            if(nums[i]<min){
                min = nums[i];
            }
            if(maxProfit<nums[i]-min){
                maxProfit = nums[i]-min;
            }
        }
        return maxProfit;
    }
}
