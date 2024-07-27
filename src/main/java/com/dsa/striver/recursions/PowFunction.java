package com.dsa.striver.recursions;

import java.util.Arrays;

public class PowFunction {
    public static void main(String[] args) {
        double[] x  = {2.00000,2.10000,2.00000};
        int[] n = {10,3,-2};
        /*Object[] mixedArray = new Object[];
        mixedArray[0]=x;
        mixedArray[1]=n;
        Arrays.stream(mixedArray)
                .map((i,j)->{
                    PowFunction::myPow
                }
                )*/
    }
    public double myPow(double x, int n) {
        return x*n;
    }
}
