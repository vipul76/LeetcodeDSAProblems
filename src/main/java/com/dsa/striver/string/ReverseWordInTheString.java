package com.dsa.striver.string;

import java.util.Stack;

public class ReverseWordInTheString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        //String s = " Hello World ";
        String reverse = reverseWord(s);
        System.out.println(reverse);
    }

    private static String reverseWord(String s) {
        String[] lineSplit = s.trim().split("\\s+");
        Stack<String> wordStack = new Stack<>();
        for(String str : lineSplit){
            wordStack.push(str);
        }
        StringBuilder sb = new StringBuilder();
        while(!wordStack.isEmpty()){
            sb.append(wordStack.pop());
            if(!wordStack.isEmpty()) sb.append(" ");
        }
        return sb.toString();
    }
}
