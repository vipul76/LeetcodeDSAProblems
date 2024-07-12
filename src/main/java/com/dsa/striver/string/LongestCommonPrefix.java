package com.dsa.striver.string;

import java.util.Arrays;
//Questions
/*
14. Longest Common Prefix
Solved
Easy
Topics
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        //String[] strs = {"flower","flow","flight"};
        String[] strs = {"cluster","clue","clutch","club","clumsy"};
        //String[] strs = {""};
        String longestCommonString = longestCommonPrefixstream(strs);
        System.out.println(longestCommonString);
    }

    //1st approach
    private static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            sb.append(first[i]);
        }
        return sb.toString();
    }

    //second approach
    private static String longestCommonPrefixSecond(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];

        for (int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    //Stream method for the above method
    private static String longestCommonPrefixstream(String[] strs) {
        if(strs == null || strs.length==0) return "";
        String prefix = strs[0];

        return Arrays.stream(strs)
                .skip(1)
                .reduce(prefix, (currentPrefix,currentString) ->{
                    while(currentString.indexOf(currentPrefix)!=0){
                        currentPrefix = currentPrefix.substring(0,currentPrefix.length()-1);
                    }
                    return currentPrefix;
                });
    }
}
