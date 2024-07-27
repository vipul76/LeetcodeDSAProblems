package com.dsa.striver.recursions;

import java.util.Arrays;

public class StringToInteger {
    public static void main(String[] args) {
        String[] str = {"4193 with words","042", " -042", "1337c0d3","0-1","words and 987",""};
        Integer[] result = Arrays.stream(str)
                .map(StringToInteger::myAtoi)
                .toArray(Integer[]::new);
        Arrays.stream(result)
                .forEach(System.out::println);
        /*
        String[] result = Arrays.stream(str)
                .map(StringToInteger::myAtoi)
                .toArray(String[]::new);
        Arrays.stream(result)
                .forEach(System.out::println);
*/
    }
    public static int myAtoi(String s){
        if(s.isEmpty()) return 0;
        StringBuilder sb = new StringBuilder();
        boolean signFlag = false;

        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='-' || ch =='+'){
                if(!signFlag) {
                    signFlag=true;
                    sb.append(ch);
                }
                else return sb.toString().isEmpty()? 0:Integer.parseInt(sb.toString());
            }
            else if(sb.isEmpty() && (ch=='0' || ch==' ')) {
                if(ch=='0') signFlag=true;
                continue;
            }
            else if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                if(sb.isEmpty()) return 0;
                return Integer.parseInt(sb.toString());
            }
            else sb.append(ch);
        }
        return sb.toString().isEmpty() ?0: Integer.parseInt(sb.toString());
    }
}
