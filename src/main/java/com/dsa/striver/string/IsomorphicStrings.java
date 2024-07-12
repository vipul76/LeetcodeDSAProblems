package com.dsa.striver.string;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1 = "foo";//"paper";//"egg";//
        String str2 = "bar";//"title";//"add";//
        boolean isIsomorphic = isIsomorphic(str1,str2);
        System.out.println(isIsomorphic);
    }

    private static boolean isIsomorphic(String s, String t) {
        if(s==null ||t==null) return false;

        Map<Character,Character> mapST = new HashMap<>();
        Map<Character,Character> mapTS = new HashMap<>();

        for (int i =0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapST.containsKey(c1)){
                if(mapST.get(c1)!=c2){
                    return false;
                }
            }
            else{
                mapST.put(c1,c2);
            }

            if(mapTS.containsKey(c2)){
                if(mapTS.get(c2)!=c1){
                    return false;
                }
            }
            else {
                mapTS.put(c2,c1);
            }
        }
        return true;
    }
}
