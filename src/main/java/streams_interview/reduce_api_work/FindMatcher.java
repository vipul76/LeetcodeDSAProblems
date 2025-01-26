package streams_interview.reduce_api_work;

import java.util.List;

public class FindMatcher {

    public int findMin(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce(Integer.MAX_VALUE,Integer::min);
    }

    public int findMax(List<Integer> numbers){
        return numbers.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
        /*return numbers
                .stream()
                .reduce(Integer.MIN_VALUE,Integer::max);*/
    }

    public double calculateAvg(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0,Integer::sum);
        long count = numbers.size();//numbers.stream.count();
        return (double) sum/count;
    }

    public String concatenate(List<String> words) {
        return words
                .stream()
                .reduce("",(a,b)->a+b);
    }
}
