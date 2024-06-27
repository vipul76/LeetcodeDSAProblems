package com.dsa.striver.Arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class LeadersInArrayProblem {
    public static void main(String[] args) {
        int[] nums = {16,17,4,3,5,2};
        int n = nums.length;
        ArrayList<Integer> leaders = leadersInArray(n,nums);
        leaders.stream().forEach((s)->System.out.print(s+"  "));
    }

    private static ArrayList<Integer> leadersInArray(int n, int[] nums) {
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()<nums[i]){
                st.pop();
            }
            st.push(nums[i]);
        }

        int[] leaders = new int[st.size()];
        int inc=leaders.length-1;
        while (!st.isEmpty()){
            leaders[inc]=st.pop();
            inc--;
        }

        return (ArrayList<Integer>) Arrays.stream(leaders)
                .boxed()
                .collect(Collectors.toList());
    }
}
