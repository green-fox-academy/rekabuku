import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();

        Fox fox1 = new Fox("Jim", "standard", "red");
        Fox fox2 = new Fox("Jack", "pallida", "white");
        Fox fox3 = new Fox("Johnny","pallida", "green");
        Fox fox4 = new Fox("Sarah","standard", "green");
        Fox fox5 = new Fox("Penny","standard", "white");

        foxes.add(fox1);
        foxes.add(fox2);
        foxes.add(fox3);
        foxes.add(fox4);
        foxes.add(fox5);

        List<Fox> greenFox = foxes.stream()
                .filter(fox -> fox.getColor().equals("green"))
                .collect(Collectors.toList());
        System.out.println(greenFox.toString());

        List<Fox> greenPallida = foxes.stream()
                .filter(fox -> fox.getColor().equals("green") && fox.getType().equals("pallida"))
                .collect(Collectors.toList());
        System.out.println(greenPallida.toString());

    }
}
