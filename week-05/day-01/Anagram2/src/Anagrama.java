import java.util.Arrays;

public class Anagrama {
    String a = "Reka";
    String b = "Kati";

    public boolean isEquels(String a, String b) {
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if (c.length == d.length) {

            return true;
        } else {
            return false;
        }
    }
}
