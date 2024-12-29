package streams_interview;

import java.util.stream.Collectors;

public class RemoveCharaterFromString {
    public static void main(String[] args) {
        String str = "java interview";
        char ch = 'a';
        String removedChar=removeCharaterFromString(str,ch);
        System.out.println("removedChar : " +removedChar);
    }

    private static String removeCharaterFromString(String str, char ch) {
        if(str==null || str.isEmpty()) return str;

        System.out.println("Using COde Points");
        str.codePoints()
                .mapToObj(c->String.valueOf((char) c))
                .forEach(System.out::print);
        System.out.println();
        System.out.println("Using actual methods");
        return str.chars()
                .filter(e->e!=ch)
                .mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
