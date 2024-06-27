package com.dsa.striver.Arrays.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};//{1,2,0,1};//{100,4,200,1,3,2};//
        int result = longestConsecutiveOptimal(nums);
        System.out.println(result);
    }
    //Complexity Analysis
    /*
    Complexity Analysis
Time Complexity: O(N) + O(2*N) ~ O(3*N), where N = size of the array.
Reason: O(N) for putting all the elements into the set data structure. After that for every starting element, we are finding the consecutive elements. Though we are using nested loops, the set will be traversed at most twice in the worst case. So, the time complexity is O(2*N) instead of O(N2).

Space Complexity: O(N), as we are using the set data structure to solve this problem.

Note: The time complexity is computed under the assumption that we are using unordered_set and it is taking O(1) for the set operations.

If we consider the worst case the set operations will take O(N) in that case and the total time complexity will be approximately O(N2).
And if we use the set instead of unordered_set, the time complexity for the set operations will be O(logN) and the total time complexity will be O(NlogN).
     */
    private static int longestConsecutiveOptimal(int[] nums) {
        int count=0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        int num =0;
        int longestLength = 0;
        for(int setNum : set){
            /*
            let the set contains 101, 4,3,2, 102,103,104,5
            we are checking length for the every number present in set
            take ->102
            since 101 is already present which already check the longest length which is 4
            so, it is waste of time to check similar for 102,103,104 as length will be 3,2,1.

            So for saving the time complexity we have eliminated this thing.
             */
            if(!set.contains(setNum-1)){
                count = 1;
                num = setNum;
                while (set.contains(num+1)){// it would not be O(n) time complexity as we are skipping many checks.
                    count++;
                    num=num+1;
                }
                longestLength = Integer.max(count,longestLength);
            }
        }
        return longestLength;
    }

    //TC : O(NlogN)+ O(N) = TC : O(NlogN)  Sc:O(1)
    private static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);  //--> O(NlogN)
        int curLen = 0;
        int maxLen=0;
        int smallestElement = Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){ //--> O(N)
            if(i==0){
                curLen=1;
            } else if (nums[i]==smallestElement) {
                continue;
            } else if (nums[i]==nums[i-1]+1) {
                curLen++;
            }
            else {
                curLen=1;
            }
            smallestElement=nums[i];
            maxLen = Integer.max(curLen,maxLen);
        }
        //Arrays.stream(nums).forEach((s)->System.out.print(s+" "));
        return maxLen;
    }
}
