package com.dsa.striver.streams;

import java.security.cert.CollectionCertStoreParameters;
import java.util.stream.Collectors;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String str = "java interview akash";
        char rm = 'a';
        String result = str.chars()
                .filter(e->e!=rm)
                .mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
