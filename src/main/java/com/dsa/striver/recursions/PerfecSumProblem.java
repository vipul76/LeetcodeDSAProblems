package com.dsa.striver.recursions;

import java.util.*;

public class PerfecSumProblem {
    public static void main(String[] args) {
        /*int[] arr = {5,2,3,10,6,8};
        int n=6, sum=10;*/

        /*int[] arr = {9,7,0,3,9,8,6,5,7,6};
        int n=10, sum=31;*/

        int[] arr = {2,3,6,7};
        int sum=7,n=4;

        int sumRes = perfectSum(arr,n,sum);
        System.out.println(sumRes);

    }

    private static int perfectSum(int[] arr, int n, int sum) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        backtrackPS(arr,0,list,set,sum);
        set.forEach((s)->System.out.println(s+", "));
        return set.size();
    }

    private static void backtrackPS(int[] arr,int index, List<Integer> curr, Set<List<Integer>> set, int sum) {
        int listSum = curr.stream().mapToInt(i->i).sum();
        if(listSum==sum){
            set.add(new ArrayList<>(curr));
            return;
        }
        if(listSum>=sum || index==arr.length){
            return;
        }
        for (int i=index;i<arr.length;i++){
            curr.add(arr[i]);
            backtrackPS(arr,i+1,curr,set,sum);
            curr.remove(curr.size()-1);
        }

    }

    private static void backtrackPSUsingRecursion(int[] arr, List<Integer> curr, Set<List<Integer>> set, int sum) {
        if(arr.length==0){
            if(!curr.isEmpty()){
                int listSum = curr.stream().mapToInt(i->i).sum();
                if(listSum==sum){
                    set.add(new ArrayList<>(curr));
                };
            }
            return;
        }
        int[] newArr = Arrays.copyOfRange(arr,1,arr.length);
        curr.add(arr[0]);
        backtrackPSUsingRecursion(newArr,curr,set,sum);
        curr.remove(curr.size()-1);
        backtrackPSUsingRecursion(newArr,curr,set,sum);
    }
}
