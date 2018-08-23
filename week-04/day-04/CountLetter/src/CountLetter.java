import java.util.HashMap;
import java.util.Map;

public class CountLetter {
    private Map<String, Integer> newHasMap;

    //Write a function, that takes a string as an argument and returns a dictionary
    // with all letters in the string as keys, and numbers as values that shows
    // how many occurrences there are.

    public void countLetter(String a, Integer freq) {
        Map<String, Integer> letter = new HashMap<String, Integer>();
        for (String a : String)
            Integer freq = letter.get(a);
        letter.put(a, (freq == null) ? 1 : freq + 1);
        System.out.println(letter.size() + " distinct words:");
        System.out.println(letter);


    }

}