import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        OptionalDouble oddNumbers = numbers.stream()
                .mapToDouble(number -> number)
                .filter(number -> number % 2 != 0)
                .average();
        System.out.println(oddNumbers);
    }
}
