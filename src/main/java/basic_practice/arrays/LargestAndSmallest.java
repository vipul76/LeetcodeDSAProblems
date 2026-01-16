package basic_practice.arrays;

import java.util.Arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        //int[] arr = new int[9];
        int[] arr = {14, 8, 7, 35, 42, 2, 25, 38, 28};


        int min = arr[0], max = arr[0];
        //way 1:
        for (int j : arr) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        //way 2:
        /*for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }*/
        System.out.println("Max : "+max +" , "+"Min : "+min);

        //way 3: using streams

        System.out.println("Max value : "+ Arrays.stream(arr).max().getAsInt());
        System.out.println("Min value : "+Arrays.stream(arr).min().getAsInt());

    }
}
