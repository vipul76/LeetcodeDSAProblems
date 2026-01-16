package yellowCoders.service;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringServiceImpl implements StringService{

    List<String> strList = Arrays.asList("apple","banana","cherry","date");

    @Override
    public String removeOccurence(String str, char ch) {

        if(str==null || str.isEmpty()){
            return str;
        }

        return str.chars()
                .filter(chars -> chars!=ch)
                .mapToObj(c-> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    @Override
    public String specialCharacter(String str) {
        return str
                .chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(ch->String.valueOf((char) ch))
                .collect(Collectors.joining());
    }

    @Override
    public String concatenateString() {
        return String.join(", ", strList);
    }

    //@Override
    /*public String concatenateStringByMe() {
        return strList
                .stream()
                .collect(Collectors.joining(", "));*/

    @Override
    public Optional<Character> firstNonRepeatingCharacter(String str) {
        return str
                .chars()
                .boxed()
                .collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .map(entry->(char) (int)entry.getKey())
                .findFirst();
    }
}