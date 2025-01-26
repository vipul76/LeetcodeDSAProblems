package streams_interview.reduce_api_work;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(8, 3, 7, 1, 5);
        List<String> words = Arrays.asList("Java", "is", "awesome");

        FindMatcher obj = new FindMatcher();

        int min = obj.findMin(numbers);
        System.out.println("Min Value : " + min);

        int max = obj.findMax(numbers);
        System.out.println("Max Value : "+ max);

        double avg = obj.calculateAvg(numbers);
        System.out.println("Average : " + avg);

        String concatenate = obj.concatenate(words);
        System.out.println("Concatenate : "+concatenate);
        //============================================================
        //Without

        
    }
}