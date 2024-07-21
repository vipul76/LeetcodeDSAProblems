package com.dsa.striver.dynamic_problem_lecture;

import java.util.Arrays;

public class FibonaaciiSeries {
    public static void main(String[] args) {
        int n = 5;
        long opRec = recursion(n);
        System.out.println("Recurrsion way : " + opRec);

        long opTopDown = topDown(n);
        System.out.println("Top Down way : " + opTopDown);

        long opBottomUp = bottomUp(n);
        System.out.println("Bottom Up way : " + opBottomUp);
    }

    private static long bottomUp(int n) {
        return 0;
    }

    private static long f(int n, long[] dp) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        dp[n] = f(n - 1, dp) + f(n - 2, dp);
        return dp[n];
    }

    private static long topDown(int n) {
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);

        return f(n, dp);
    }

    private static long recursion(int n) {
        if(n==0) return 0;
        if (n == 1) return 1;
        return recursion(n - 1) + recursion(n - 2);
    }
}