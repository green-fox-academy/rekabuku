import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number,
        // than it should write to a file.
        // The path parameter should be a string, that describes the location of the file.
        // The word parameter should be a string, that will be written to the file as lines
        // The number parameter should describe how many lines the file should have.
        // So if the word is "apple" and the number is 5, than it should write 5 lines
        // to the file and each line should be "apple"
        // The function should not raise any error if it could not write the file.

        String path = "my-file";
        String word = "apple";
        int lines = 5;
        lineWriter("my-file.txt", "apple", 5);


    }
    public static void lineWriter (String path, String word, int lines) {
        List<String> content = new ArrayList();
        for (int i = 0; i < lines; i++) {
            content.add(word);
        }
        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Could not write the file!");

        }

    }

}