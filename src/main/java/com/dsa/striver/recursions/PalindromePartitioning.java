package com.dsa.striver.recursions;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";//"aabb";
        List<List<String>> partionString = partition(s);
        partionString.forEach((str)->{
            str.forEach(itr -> System.out.print(itr+" "));
            System.out.println();
        });
    }

    private static List<List<String>> partition(String s) {
        List<List<String>> resultantStr = new ArrayList<>();
        List<String> list = new ArrayList<>();
        dfs(0,s,list,resultantStr);
        return resultantStr;
    }

    private static void dfs(int index, String s, List<String> list, List<List<String>> resultantStr) {
        if(index == s.length()){
            resultantStr.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                list.add(s.substring(index,i+1));
                dfs(i+1,s,list,resultantStr);
                list.remove(list.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
}
/*
resultantStr.add(List.of("a","a","b","b"));
        resultantStr.add(List.of("a","a","bb"));
        resultantStr.add(List.of("aa","bb"));
        resultantStr.add(List.of("aa","b","b"));
 */