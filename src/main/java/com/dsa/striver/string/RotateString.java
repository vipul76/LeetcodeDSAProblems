package com.dsa.striver.string;

public class RotateString {
    public static void main(String[] args) {
        String s = "bbbacddceeb";//"gcmbf";//"abcde";
        String goal = "ceebbbbacdd";//"fgcmb";//"bcdez";//"cdeab";
        boolean isRotate = rotateString(s,goal);
        System.out.println(isRotate);
    }

    //KMP algorithm ->Knuth-Morris-Pratt (KMP) algorithm
    //
    private static boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length()) return false;
        String concateStr = s+goal;  // tc: O(n)
        return concateStr.contains(goal); // tc:o(2*n)  ~ O(n)
    }


    // It failed for the similar set of the character
    //s ="bbbacddceeb" , goal = "ceebbbbacdd"
    //Use Testcase : Output -> false : Expected -> true
    private static boolean rotateStringwrong(String s, String goal) {
        System.out.println("sLength : "+ s.length()+ " : goalLength : "+goal.length());
        if(s.length()!=goal.length()) return false;

        int sItr = 0,gItr = 0;
        char sChar = s.charAt(sItr), gChar = goal.charAt(gItr);

        while (gChar!=sChar && gItr<goal.length()-1){
            gItr++;
            gChar = goal.charAt(gItr);
        }

        while (sItr<s.length()){
            if(gItr== goal.length()) gItr = 0;

            sChar = s.charAt(sItr);
            gChar = goal.charAt(gItr);

            if(sChar!=gChar) return false;

            sItr++;
            gItr++;
        }
        return true;
    }
}
