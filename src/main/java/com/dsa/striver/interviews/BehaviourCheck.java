package com.dsa.striver.interviews;

public class BehaviourCheck {
    public static void main(String[] args) {
        int N = 5;
        int[] Behaviour = {2,5,1,8,4};
        BehaviourCheck behaviourCheck = new BehaviourCheck();
        int result = behaviourCheck.solve(N,Behaviour);
        System.out.println(result);
    }

    int solve(int n, int[] behaviour) {
        int result = 0;
        for (int i=0;i<n;i++){
            if(i==0){
                int check = behaviour[i+1]/2;
                if(check>behaviour[i]) ++result;
            }
            else if(i==n-1){
                int check = behaviour[i-1]/2;
                if(check>behaviour[i]) ++result;
            }
            else{
                int check = behaviour[i+1] + behaviour[i-1];
                check =check/2;
                if(check>behaviour[i]) ++result;
            }
        }
        return result;
    }
    public int solveBehaviour(int n, int[] behaviour) {
        return 0;
    }
}