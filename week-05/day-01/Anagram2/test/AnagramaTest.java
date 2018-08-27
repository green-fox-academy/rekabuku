import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class AnagramaTest {

    @Test
    public void FirstTest() {
        Anagrama a = new Anagrama();
        a.isEquels("text", "text2");
        assertEquals(a.isEquels("Reka", "Kati"), true);
    }

    @Test
    public void SecondTest() {
        Anagrama a = new Anagrama();
        a.isEquels("text", "text2");
        assertTrue(a.isEquels("text", "text"));
    }
}


