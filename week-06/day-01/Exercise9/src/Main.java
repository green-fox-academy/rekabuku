import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Character[] chars = {'a','p','p','l','e'};

        String value = Arrays.stream(chars)
                .map(Object::toString)
                .collect( Collectors.joining() );
        System.out.println(value);
    }
}
