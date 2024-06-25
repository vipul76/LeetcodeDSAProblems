package com.dsa.striver.Arrays.medium;

import java.util.Arrays;

public class ColorSort {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int[] result = sortColorB(nums);
        Arrays.stream(result).forEach((s)->System.out.print(s+" "));
    }

    // Using 3 varibles  TC : O(2*n) SC:(1)
    private static int[] sortColorB(int[] nums) {
        int n = nums.length;
        int count_0=0, count_1=0, count_2=0;

        for(int i=0;i<n;i++){
            if (nums[i]==0) count_0++;
            else if (nums[i]==1) count_1++;
            else if (nums[i]==2) count_2++;
            else throw new RuntimeException("Please enter valid color(0,1,2)");
        }
        for(int i=0;i<n;i++){
            if(count_0!=0){
                nums[i]=0;
                count_0--;
            } else if (count_1!=0) {
                nums[i]=1;
                count_1--;
            }
            else {
                nums[i]=2;
                count_2--;
            }
        }
        return nums;
    }

    private static int[] sortColor(int[] nums) {
        int len = nums.length;
        int low=0,mid=0;
        int high = len-1;
        while (mid<=high){
            if(nums[mid]==0){
                nums = swap(nums,low,mid);
                low++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            }
            else{
                nums = swap(nums,mid, high);
                high--;
            }
        }
        return nums;
    }

    private static int[] swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        return nums;
    }
}
