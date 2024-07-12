package com.dsa.striver.string;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
       // String s = "anagram", t = "nagaram";
        String s = "rat", t = "tar";
        boolean isAnagram = isAnagramOptimize(s,t);
        System.out.println(isAnagram);
    }

    private static boolean isAnagramOptimize(String s, String t) {
        int[] freq = new int[26];
        s=s.toUpperCase();
        t=t.toUpperCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'A']++;
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            freq[ch-'A']--;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }

    // Tc: O(nlogn) --> beacause of sorting  Sc: O(1)
    private static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] first = s.toCharArray();
        Arrays.sort(first);

        char[] second = t.toCharArray();
        Arrays.sort(second);

        for(int i=0;i<first.length;i++){
            if (first[i]!=second[i]) return false;
        }
        return true;
    }
}
