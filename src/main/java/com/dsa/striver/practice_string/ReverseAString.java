package com.dsa.striver.practice_string;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Collections.reverse;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "My name is vipul Nilesh";
        String rev = reverseString(str);
        System.out.println(rev);
    }

    //using Lambda approach
    private static String reverseString(String str) {
        return Arrays.stream(str.split(" "))//converting the string to stream and splitting it into words
                        .collect(Collectors.collectingAndThen(//it first collects all the words and then send it to finish the operations as
                            Collectors.toList(), //Downstream -> sending the list of words after collecting it into words in stream
                            list ->{             //Finisher -> operations performed after the  finished product like reversing the sentence
                                reverse(list);
                                return list.stream();
                            })).collect(Collectors.joining(" "));
    }

    //General Approach for reversing a string
    private static String reverseStringgeneral(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            reversedSentence.append(words[i]);
            if(i>0){
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }// Output ->Nilesh vipul is name My

    private static String reverseStringword(String str) {
        StringBuilder result = new StringBuilder();
        char[] ch  = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i= ch.length-1;i>=0;i--){
            if(ch[i]==' '){
                result.append(" ").append(sb.toString());
                sb = new StringBuffer();
            }
            sb.append(ch[i]);
        }
        result.append(sb.toString());
        return result.toString();
    }
}
