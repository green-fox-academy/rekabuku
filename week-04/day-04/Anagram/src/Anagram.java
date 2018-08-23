import java.util.Arrays;

public class Anagram {
    //Write a function, that takes two strings and returns a boolean value
    // based on if the two strings are Anagrams or not.

    String name;

    public Anagram(String name) {
        this.name = name;
    }

    public boolean isAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        } else {
            char[] firstWordAsChar = firstWord.toCharArray();
            char[] secondWordAsChar = secondWord.toCharArray();
            Arrays.sort(firstWordAsChar);
            Arrays.sort(secondWordAsChar);
            for (int i = 0; i < firstWordAsChar.length; i++) {
                if (firstWordAsChar[i] != secondWordAsChar[i])
                    return false;
            }
        }
        return true;
    }
}
