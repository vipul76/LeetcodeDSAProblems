package streams_interview.string;

import java.util.Arrays;
import java.util.List;

public class ConcatenateString {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Apple","Banana","Cherry","Date");
        //way1 -> (1)Not an appropriate way to use the [String Buffer(shared resource)] as in the functional programming.
        //(2) -> we were returning empty map which is actually wrong and The reduce() function should be used for combining
        // elements into a single result. However, it is incorrectly used here,
        // as the StringBuilder concatenation is already handled in the map() step, making this step unnecessary.
        String str1 = strings
                        .stream()
                        .map(s->{
                            sb.append(s);
                            return "";}) //Since StringBuilder is static that's why return statement is ignored
                        .reduce((first,second)->
                                sb.toString())
                        .orElse("");
        System.out.println(str1);

        //Way2 ->
        String str = strings
                .stream()
                .reduce("",(s1,s2)->s1+s2);
        System.out.println("way2 : "+ str);
    }
}
