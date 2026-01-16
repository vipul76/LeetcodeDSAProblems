package yellowCoders.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NumberServiceImpl implements NumberService{
    List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    List<Integer> repeatNumber = Arrays.asList(1,2,3,4,5,2,6,3,7,8,4);
    List<Integer> listNumber = Arrays.asList(11,18,20,24,85,66,12,13);

    @Override
    public Map<String, Integer> evenOdd() {

        Map<Boolean,Integer> sums = number
                .stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0, Collectors.summingInt(Integer::intValue)));

        return Map.of("Even",sums.get(true),"Odd",sums.get(false));
    }

    @Override
    public List<Integer> duplicateNumber() {
        return repeatNumber
                .stream()
                .collect(Collectors.groupingBy(num->num,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> startsWith1() {
        return listNumber
                .stream()
                .filter(num -> String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());
    }
}
