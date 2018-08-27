import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.*;

public class TestNumberConverter {
   /* @Test
    public void TestConverter(){
        Converter c = new Converter();
        c.Checker(1050);
        assertEquals("new number", "ok");
    }
    */

    @Test
    public void TestConverter2() {
        Converter c = new Converter();
        assertEquals(c.numberToWord(5), " FIVE");
    }

    
}
