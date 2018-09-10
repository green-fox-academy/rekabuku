
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String newWord = "football";

        Map<Character, Integer> frequency = newWord.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1)));
        System.out.println(frequency);
    }
}
