package com.dsa.striver.streams.string_type;

import java.util.stream.Collectors;

public class SpeciaCharacter {
    public static void main(String[] args) {
        String str = "Ilove@xyz#so$much%76";
        String rmSpecial = str.chars()
                .filter(c->!Character.isLetterOrDigit(c))
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println(rmSpecial);
    }
}
