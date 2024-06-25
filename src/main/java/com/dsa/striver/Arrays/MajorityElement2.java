package com.dsa.striver.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        //int[] nums = {1};
        //int[] nums = {1,2};
        List<Integer> MElement = ME2(nums);
        MElement.stream().forEach((s)->System.out.print(s + " "));
    }
    public static List<Integer> ME2(int[] nums){
        int count1=0,count2=0;
        int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE;
        for(int num : nums){
            if(count1==0 && candidate2!=num){
                candidate1 = num;
                count1++;
            }
            else if(count2==0 && candidate1!=num){
                candidate2 = num;
                count2++;
            }
            else if(candidate1==num){
                count1++;
            } else if (candidate2==num) {
                count2++;
            }
            else{
                candidate1--;
                candidate2--;
            }
        }
        count1=0;
        count2=0;
        for(int num : nums){
            if(candidate1==num) count1++;
            else if (candidate2==num) count2++;

        }
        List<Integer> result = new ArrayList<>();
        int min = (int)Math.ceil(nums.length/3.0);
        if(count1>=min) result.add(candidate1);
        if(count2>=min) result.add(candidate2);

        return result;
    }
}
