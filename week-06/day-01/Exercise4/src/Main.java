import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
        numbers.stream()
                .mapToDouble(number -> number)
                .filter(number -> number > 0)
                .map(number -> Math.pow(number,2.0))
                .filter(number -> number > 20)
                .forEach(System.out::println);
    }
}
