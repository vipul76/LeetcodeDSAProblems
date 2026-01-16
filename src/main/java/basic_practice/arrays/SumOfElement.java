package basic_practice.arrays;

import java.util.Arrays;

public class SumOfElement {
    public static void main(String[] args){
        int[] arr = {14,8,7,35,42,2,25,38,28};

        int sum=0;
        for(int j : arr){
            sum = sum+j;
        }
        System.out.println(sum);

        System.out.println(Arrays.stream(arr).sum());
    }
}
