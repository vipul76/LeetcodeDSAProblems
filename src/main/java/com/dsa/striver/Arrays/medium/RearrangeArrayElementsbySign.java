package com.dsa.striver.Arrays.medium;

import java.util.*;
import java.util.stream.Collectors;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int[] nums={28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        //{-1,1};//{3,1,-2,-5,2,-4};
        int result[] = rearrangeArrayLinear(nums);
        Arrays.stream(result).forEach((s)->System.out.print(s+" "));
    }

    private static int[] rearrangeArrayLinear(int[] nums) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(nums.length,0));
        int posIndex =0 , negIndex = 1;
        for(int num: nums){
            if (num < 0) {
                result.set(negIndex,num);
                negIndex = negIndex+2;
            }
            else{
                result.set(posIndex, num);
                posIndex = posIndex+2;
            }
        }
        return result
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static int[] rearrangeArray(int[] nums) {

        System.out.println("Input array length : " +nums.length);
       List<Integer> posList =  Arrays.stream(nums)
                .filter((s)->s>0)
                .boxed()
                .collect(Collectors.toList());
       List<Integer> negList = Arrays.stream(nums)
               .filter((s)->s<0)
               .boxed()
               .collect(Collectors.toList());
        System.out.println();
       for (int i=0;i<nums.length/2;i++){
               nums[2*i] = posList.get(i);
               nums[2*i+1] = negList.get(i);
       }
       return nums;
       //Java stream testing
        /*Map<Boolean,List<Integer>> partionedNumber = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.partitioningBy((s)->s>0));

        System.out.println("positive lis");
        partionedNumber.get(true).forEach((s)->System.out.print(s+" "));
        System.out.println();
        System.out.println("negative list");
        partionedNumber.get(false).forEach((s)->System.out.print(s+" "));*/
    }

    //Wrong answer getting for this approach as j moves forwardof the negative number
    //input array : [28, -41, 22, -8, 46, -37, 35, -9, 18, -6, 19, -26, 15, -10, -9, -37, 14, 31]
    //Debug array : [28, -41, 22, -8, -37, 46, 35, -9, 18, -6, 19, -26, -37,-10,-9,15,14,31]
    // issue is -10 should come first and -37 goes after -10 (Insertion order is not preserved.
    //Output array : [28,-41,22,-8,46,-37,35,-9,18,-6,19,-26,15,-10,14,-37,31,-9]
    private static int[] rearrangeArrayWrong(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i==0 && nums[i]<0 && nums[j]>0){
                    nums=swapNumber(nums,i,j);
                } else if (i>0&& nums[i]<0 && nums[i-1]<0 && nums[j]>0 ) {
                    nums=swapNumber(nums,i,j);
                    break;
                }
                else if(i>0&& nums[i]>0 && nums[i-1]>0 && nums[j]<0 ){
                    nums=swapNumber(nums,i,j);
                    break;
                }
            }
        }
        return nums;
    }

    private static int[] swapNumber(int[] nums,int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        return nums;
    }
}
