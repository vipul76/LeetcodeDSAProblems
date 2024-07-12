package com.dsa.striver.string.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "Aabb";//"tree";
        String output = frequencySortJava11(s);
        System.out.println(output);
    }

    private static String frequencySortJava11(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> countMap = new HashMap<>();

        for (char ch : s.toCharArray()){
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);
        }

        countMap = countMap
                .entrySet()
                .stream()
                .sorted((entry1,entry2)->{
                    return entry2.getValue().compareTo(entry1.getValue());
                }).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new));

        for(Map.Entry<Character,Integer> entry : countMap.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();
            sb.append(String.valueOf(key).repeat(val));
        }
        return sb.toString();
    }


    //Below Java 11 code
    private static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> countMap = new HashMap<>();

        //char[] charArr = s.toCharArray();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(countMap.containsKey(ch)){
                int freq = countMap.get(ch);
                countMap.put(ch,++freq);
            }
            else {
                countMap.put(ch,1);
            }
        }
        countMap = countMap
                .entrySet()
                .stream()
                .sorted((entry1,entry2)->{
                            return entry2.getValue().compareTo(entry1.getValue());
                }).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new
                ));

        for(Map.Entry<Character,Integer> entry : countMap.entrySet()){
            //System.out.println("Key : "+entry.getKey() + " value : "+entry.getValue());
            char key = entry.getKey();
            int value = entry.getValue();
            while(value!=0){
                sb.append(key);
                value--;
            }
        }
        return sb.toString();
    }
}
