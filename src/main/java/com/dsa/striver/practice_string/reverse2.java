package com.dsa.striver.practice_string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverse2 {
    public static void main(String[] args) {
        //input : welcome to the abxdef organization
        //output : fedxba eht ot emoclew organization
        String str = "welcome to the abxdef organization";
        String reverse = customizedReverse(str);
        String reverseLambda = customizedReverseUsingLambdaChatgpt(str);
        //System.out.println(reverse);
        System.out.println(reverseLambda);
    }

    /*
    Misuse of Collectors.collectingAndThen:
The collectingAndThen is typically used when you need to perform some additional action after collecting the stream into a collection
(like a list or set). However, in this case, you're reversing words, and we don't need to wrap the whole stream like this.
     */
    private static String customizedReverseUsingLambda(String str) {
        return Arrays.stream(str.split(" "))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream().limit(1)
                                .map(word-> new StringBuilder(word).reverse().toString())))
                .collect(Collectors.joining(" "));
    }

    private static String customizedReverseUsingLambdaChatgpt(String str) {
        return Arrays.stream(str.split(" ")) // Convert the sentence into a stream of words
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), // Collect words into a list
                        list -> {
                            // Reverse all words except the last one
                            for (int i = 0; i < list.size() - 1; i++) {
                                list.set(i, new StringBuilder(list.get(i)).reverse().toString());
                            }
                            // Join the reversed words and append the last word
                            return list.stream()
                                    .collect(Collectors.joining(" ")) + " " + list.get(list.size() - 1);
                        }
                ));
    }

    private static String customizedReverse(String str) {
        String[] words = str.split(" ");
        StringBuilder reverseWord = new StringBuilder();

        for(int i= words.length-2;i>=0;i--){
            reverseWord.append(reverseWords(words[i]));
            if(i>0){
                reverseWord.append(" ");
            }
        }
        reverseWord.append(words[words.length-1]);
        return reverseWord.toString();
    }
    private static String reverseWords(String words) {
        char[] ch = words.toCharArray();
        StringBuilder reverseCharacter = new StringBuilder();
        for (int i=ch.length-1;i>=0;i--){
            reverseCharacter.append(ch[i]);
        }
        return reverseCharacter.toString();
    }

}
