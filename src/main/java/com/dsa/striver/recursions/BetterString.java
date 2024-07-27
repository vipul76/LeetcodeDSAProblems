package com.dsa.striver.recursions;

import java.util.HashSet;
import java.util.Set;

//Geeks for Geeks question on substring
//To optimise more we need to use Dynamic Programming
//TC for recursive approach is O(2^N)
/*
Better String
Difficulty: HardAccuracy: 44.5%Submissions: 56K+Points: 8
Given a pair of strings of equal lengths, Geek wants to find the better string. The better string is the string having more number of distinct subsequences.
If both the strings have equal count of distinct subsequence then return str1.

Example 1:

Input:
str1 = "gfg", str2 = "ggg"
Output: "gfg"
Explanation: "gfg" have 6 distinct subsequences whereas "ggg" have 3 distinct subsequences.
Example 2:

Input: str1 = "a", str2 = "b"
Output: "a"
Explanation: Both the strings have only 1 distinct subsequence.

 */
public class BetterString{
    public static void main(String[] args) {
        String str1 = "gfg";
        String str2 = "ggg";

        String result = betterString(str1,str2);
        System.out.println(result);
    }

    private static String betterString(String str1, String str2) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        findSubSequence(str1,"",set1);
        findSubSequence(str2,"",set2);
        int count1 = set1.size();
        int count2 = set2.size();

        return count1>=count2? str1 : str2;
    }

    private static void findSubSequence(String str, String current, Set<String> set) {
        if(str.isEmpty()){
            if(!current.isEmpty()){
                set.add(current);
            }
            return;
        }
        findSubSequence(str.substring(1),current+str.charAt(0),set);
        findSubSequence(str.substring(1),current,set);
    }
}
