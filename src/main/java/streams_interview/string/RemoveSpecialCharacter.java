package streams_interview.string;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        RemoveSpecialCharacter removeSC= new RemoveSpecialCharacter();
        String str = "Hello,World! 123 #Java$Stream";
        //String str = "Hello,World!123#Java$Stream";
        Set<Character> removeSpecialCh = removeSC.removeSpecialCharacter2(str);
        System.out.println("Before : "+removeSpecialCh);
        try {
            removeSpecialCh.add('v');
        }catch(Exception e){
            System.out.println("Can't add as it is an unmodifiable set");
        }
        System.out.println("After : "+removeSpecialCh);
    }

    private Set<Character> removeSpecialCharacter2(String str) {
        return str.chars()
                .filter(c->!Character.isLetterOrDigit(c))
                .mapToObj(c->(char)c)
                .collect(Collectors.toSet());
    }

    private List<Character> removeSpecialCharacter1(String str) {
        return str.chars()
                .mapToObj(c->(char) c)
                .filter(c -> !Character.isLetterOrDigit(c))
                .collect(Collectors.toList());
    }
}
