package basic_practice.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {14,8,7,35,42,2,25,38,28};

        for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            Arrays.stream(arr).forEach(element -> System.out.print(element+", "));
        }
    }
}
