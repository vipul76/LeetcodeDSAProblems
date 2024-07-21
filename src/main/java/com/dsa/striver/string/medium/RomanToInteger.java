package com.dsa.striver.string.medium;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int num = romanToInt(s);
        System.out.println(num);
    }

    private static int romanToInt(String s) {
        int num = 0;
        for (int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'I' :   num=num+1;
                case 'V' :;  num=num+5;
                case 'X' :   num=num+10;
                case 'L' :   num=num+50;
                case 'C' :   num=num+100;
                case 'D' :   num=num+500;
                case 'M' :   num=num+1000;
            }
        }

        return num;
    }

}
