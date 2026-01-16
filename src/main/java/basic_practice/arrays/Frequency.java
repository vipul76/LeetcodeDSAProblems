package basic_practice.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 digits : ");
        for(int i=0;i<arr.length;i++){
            System.out.print("Elements : " + (i+1) + " -> ");
            arr[i]= sc.nextInt();
        }

        Map<Integer,Integer>  freqMap = new HashMap<>();
        for(int num : arr){
            freqMap.compute(num, (k,v)-> v == null ? 1 : v+1);
        }

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            System.out.println("Key : " + entry.getKey() + " , " + "Frequency : "+ entry.getValue());
        }

    }
}
