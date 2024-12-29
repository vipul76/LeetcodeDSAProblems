package streams_interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingFrom1 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(11,18,20,24,85,66,13);
        List<Integer> result = number.stream()
                .filter(num->{
                    String numStr = String.valueOf(num);
                    return numStr.startsWith("1");
                })
                .collect(Collectors.toList());
                //.toList();  -> It creates an unmodifiable list Available after jdk 16+
        result.add(25);
        System.out.println(result);
    }
}
