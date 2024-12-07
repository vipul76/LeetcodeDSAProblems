package streams_interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SumOfNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        sumMethodStream(list);
        averageStream(list);

    }

    private static void averageStream(List<Integer> list) {
        double avg = list.stream()
                .mapToInt(i->i)
                .average()
                .orElse(0.0);
        System.out.println("avg : " + avg);

    }

    //In summary, reduce is a powerful tool for combining elements of a stream into a single value using custom logic.
    private static void sumMethodStream(List<Integer> list) {

        int sum = list.stream()
                .mapToInt(t->t)
                .sum();
        System.out.println(sum);

        //using Optionals and reduce method
        Optional<Integer> optSum = list.stream()
                .reduce(Integer::sum);
        System.out.println(optSum);
    }
}
