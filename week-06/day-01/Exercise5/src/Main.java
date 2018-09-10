import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String apple = "Apple";

        apple.chars()
                .filter(Character::isUpperCase)
                .mapToObj(i -> (char) i)
                .forEach(System.out::println);

    }
}
