package com.dsa.striver.interviews;

import java.util.Scanner;

public class BehaviouCheck1 {
    public static void main(String[] args) {
        BehaviourCheck BehaviouCheck1 = new BehaviourCheck();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] behaviour = new int[n];
        for(int i=0;i<n;i++){
            behaviour[i] = sc.nextInt();
        }
        int result = BehaviouCheck1.solveBehaviour(n,behaviour);
        System.out.println(result);
    }

}
