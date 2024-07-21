package com.dsa.striver.string.medium;

import java.util.Stack;

public class MaximumNestingDepthoftheParentheses {
    public static void main(String[] args) {
        String s = "";//"()(())((()()))" ;//"(1)+((2))+(((3)))";//"(1+(2*3)+((8)/4))+1";
        int depth = maxDepth(s);
        System.out.println(depth);
    }

    private static int maxDepth(String s) {
        int count = 0;
        int maxDepth = 0;
        Stack<Character> st = new Stack<>();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                count++;
            } else if (s.charAt(i)==')') {
                st.pop();
                count--;
            }
            maxDepth = Integer.max(maxDepth,count);
        }
        return maxDepth;
    }
}
