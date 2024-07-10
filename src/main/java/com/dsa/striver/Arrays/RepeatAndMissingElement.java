package com.dsa.striver.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatAndMissingElement {
    public static void main(String[] args) {
        int[] nums = {3,1,2,5,3};
        int[] result = repeatedNumberHash(nums);
        Arrays.stream(result).forEach((s)->System.out.print(s + " "));

    }

    private static int[] repeatedNumberHash(int[] A) {
        int n = A.length;
        int missingElement = -1, dupElement = -1;
        int[] hash = new int[n+1];
        for(int i=0;i<n;i++){
            hash[A[i]]++;
        }
        for(int i=1; i<n+1; i++){
            if(hash[i]==0) missingElement = i;
            else if (hash[i]==2) dupElement = i;

            if(missingElement==-1 && dupElement==-1)
                break;
        }

        return new int[]{dupElement,missingElement};
        //return new int[0];
    }


    //Using hashmap  Tc: O(2N)  SC: O(n)
    private static int[] repeatedNumber(final int[] A) {
        int missingElement = -1, dupElement = -1;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int num : A){
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
                dupElement = num;
            }
            else{
                hm.put(num,1);
            }
        }
        for(int i=1; i<A.length; i++){
            if(!hm.containsKey(i)){
                missingElement = i;
            }
        }

        return new int[]{dupElement,missingElement};
    }
}
