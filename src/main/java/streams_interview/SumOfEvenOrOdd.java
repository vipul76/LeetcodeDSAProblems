package streams_interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfEvenOrOdd {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        //Way 1
        int even = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(even);

        int odd = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(odd);


        //Way 2 -> Collecting the sum of even numbers and odd numbers
        /*Collectors.partitioningBy(num->num % 2==0) ->
          Divide the list in 2 parts based on the condition given in boolean format.*/
        Map<Boolean,Integer> sum = numbers
                .stream()
                .collect(Collectors.partitioningBy(num->num % 2==0,
                        Collectors.summingInt(Integer::intValue)));

        int sumEven = sum.get(true);
        int sumOdd = sum.get(false);
        System.out.println("Even sum : "+ sumEven);
        System.out.println("Odd Sum : "+ sumOdd);

        //COllecting the whole list even and the odd number

        Map<Boolean,List<Integer>> partitionList = numbers
                .stream()
                .collect(Collectors.partitioningBy(n -> n%2==0,
                        Collectors.toList()));

        System.out.println("even list : "+ partitionList.get(true));
        System.out.println("odd list : "+ partitionList.get(false));
    }
}
