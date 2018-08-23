import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    private Apple a;

    @Before
    public void createApple() {
        a = new Apple("Apple");
    }

    @Test
    public void getName() {
        assertEquals("Apple", a.getName());
    }

    @Test
    public void getNameTwo() {
        assertEquals("apple", a.getName());
    }
}