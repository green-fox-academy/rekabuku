import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AnagramTest {

    @Test
    public void isAnagram() {
        Anagram test = new Anagram();
        assertTrue(test.isAnagram("listen", "silent") == true);
    }
}