package interview;

import java.util.Arrays;
import java.util.List;
import java.util.logging.SocketHandler;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<List<String>> departmenEmployees = Arrays.asList(
                Arrays.asList("John","Dheere"),
                Arrays.asList("Amily Davis","Michel Clark"),
                Arrays.asList("Chris Williamson","Neil Johnsn")
        );
        System.out.print("Flatten the List<List<String> to List<String> : ");
        List<String> allEmp = departmenEmployees.stream()
                .flatMap(List::stream)//.flatMap(list->list.stream())
                .toList();
        System.out.println(allEmp);

        System.out.print("Starts with M string : ");
        List<String> startsWithM = allEmp
                .stream()
                .filter(t->t.startsWith("M"))
                .toList();
        System.out.println(startsWithM);
    }
}
