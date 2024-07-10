package com.dsa.striver.streams;

import java.util.Arrays;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 153, 370, 371, 407, 9474, 54748, 92727, 93084, 9473);
        List<Integer> armstrongNumbers = list
                .stream()
                .filter(ArmstrongNumber::isArmstrong)
                .toList();
        armstrongNumbers.stream().forEach((s)->System.out.print(s+" "));
    }

    private static boolean isArmstrong(Integer num) {
        int originalNum = num;
        int sum = 0;
        int numberOfDigit = String.valueOf(num).length();
        while(num!=0){
            int digit = num%10;
            sum += Math.pow(digit,numberOfDigit);
            num = num/10;
        }
        if(sum == originalNum) return true;
        return false;
    }
}
