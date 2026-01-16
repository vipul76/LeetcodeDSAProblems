package yellowCoders.service;

import java.util.Optional;

public interface StringService {
    String removeOccurence(String str, char ch);

    String specialCharacter(String str);

    String concatenateString();

    Optional<Character> firstNonRepeatingCharacter(String str);
}
