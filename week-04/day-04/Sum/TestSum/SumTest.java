import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void sumElements() {
        Sum test = new Sum();
        ArrayList<Integer> listOfSum = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(6, test.sumElements(listOfSum));
    }

    @Test
    public void sumElementsEmpty() {
        Sum test = new Sum();
        ArrayList<Integer> listOfSum = new ArrayList<>(Arrays.asList());
        assertEquals(0, test.sumElements(listOfSum));
    }

    @Test
    public void sumElement() {
        Sum test = new Sum();
        ArrayList<Integer> listOfSum = new ArrayList<>(Arrays.asList(1));
        assertEquals(1, test.sumElements(listOfSum));
    }

    @Test (expected = AssertionError.class)
    public void sumElementsNull() {
        Sum test = new Sum();
        ArrayList<Integer> listOfSum = new ArrayList<>(Arrays.asList());
        assertEquals(1, test.sumElements(listOfSum));
    }
}