package com.dsa.striver.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArray {
    public static void main(String[] args) {
        /*int[] nums1 = {1,3,5};
        int[] nums2 = {2,4,6,8,9,10};*/
        //int m = 3,n=3;
        int[] nums1 = {1,2,3,188,222,435,643,7532,78964};
        int[] nums2 = {2,5,6,7,8,9};

        int[] sortedArray = mergeArraysStream(nums1,nums2);
        Arrays.stream(sortedArray).forEach((s) -> System.out.print(s + " "));
    }

    private static int[] mergeArraysStream(int[] nums1, int[] nums2) {
        return IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2))
                .sorted()
                .toArray();
    }

    //TC : O(n)
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length+arr2.length];
        int itr1 = 0, itr2 =0;

        for(int i=0;i<arr.length;i++){
            if(itr1<arr1.length && itr2<arr2.length){
                if(arr1[itr1]<arr2[itr2]){
                    arr[i]=arr1[itr1];
                    itr1++;
                }
                else{
                    arr[i]=arr2[itr2];
                    itr2++;

                }
            }
            else if(itr1<arr1.length && itr2>=arr2.length){
                arr[i]=arr1[itr1];
                itr1++;
            }
            else if(itr1>=arr1.length && itr2<arr2.length){
                arr[i]=arr2[itr2];
                itr2++;
            }
        }
        return arr;
    }

    //TC : O(NlogN)
    private static int[] mergeWithSort(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        /*for(int i=0;i<arr1.length;i++){
            arr[i] = arr1[i];
        }*/
        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        int j=0;
        for(int i=arr1.length;i<arr.length;i++){
            arr[i]=arr2[j];
            j++;
        }
        Arrays.sort(arr);
        return arr;
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