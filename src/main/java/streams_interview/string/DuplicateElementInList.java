package streams_interview.string;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,2,6,3,7,8,4);

        List<Integer> duplicateNum = findDuplicateGeneral(list);
        System.out.println("duplicateNum : "+ duplicateNum);

        Set<Integer> duplicate = findDuplicate(list);
        System.out.println("duplicate : "+duplicate);

        List<Integer> findDuplicateWay3 = findDuplicateWay3(list);
        System.out.println("findDuplicateWay3 : "+findDuplicateWay3);

    }

    private static List<Integer> findDuplicateWay3(List<Integer> list) {
        return list.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


    private static List<Integer> findDuplicateGeneral(List<Integer> list) {
        Set<Integer> num = new HashSet<>();
        List<Integer> dup = new ArrayList<>();
        for (Integer li : list){
            if (num.contains(li)) {
                dup.add(li);
            } else {
                num.add(li);
            }
        }
        return dup;
    }

    private static Set<Integer> findDuplicate(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        list.forEach(num -> {
            if(!seen.add(num)){
                duplicate.add(num);
            }
        });
        return duplicate;
    }

    //Using the Java preparation website

}
