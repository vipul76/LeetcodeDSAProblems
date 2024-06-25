package com.dsa.striver.Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        /*int[] nums1 = {1,3,5};
        int[] nums2 = {2,4,6,8,9,10};*/
        //int m = 3,n=3;
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};

        int[] sortedArray = merge(nums1,nums2);
        Arrays.stream(sortedArray).forEach((s) -> System.out.print(s + " "));
    }

    private static int[] merge(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int[] result = new int[len1+len2];
        int incr1 = 0, incr2 =0;

        for(int incr=0;incr<result.length;incr++){
            if(incr1<len1 && incr2<len2) {
                if (nums1[incr1] < nums2[incr2]) {
                    result[incr] = nums1[incr1];
                    incr1++;
                } else {
                    result[incr] = nums2[incr2];
                    incr2++;
                }
            }
            else if(incr1<len1){
                result[incr] = nums1[incr1];
                incr1++;
            } else if (incr2<len2) {
                result[incr] = nums2[incr2];
                incr2++;
            }
        }
        return result;
    }

}