package com.dsa.striver.string;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String str = "3542748";
        String longestOddStr = largestOddNumber(str);
        System.out.println(longestOddStr);

    }
    //Oth space index of substring should be odd to be the odd string
    //We are checking from the last if the number is odd then the whole substring
    // will be the longest odd number string.
    //ex : 3542742 -> here 7 is odd so ans = 35427 next odd is 5 which is 35 and it is less
    //than the 35427.
    private static String largestOddNumber(String str) {
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            int num = Character.getNumericValue(str.charAt(i));
            if(num%2!=0){
                return str.substring(0,i+1);
            }
        }
        return "";
    }
}
