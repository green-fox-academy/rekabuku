import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class PokerTest {
    Poker poker = new Poker();

    @Test
    public void witheWins() {
        ArrayList<String> withePlayerCards = new ArrayList(asList("2C", "3H", "4S", "8C", "AH"));
        ArrayList<String> blackPlayerCards = new ArrayList(asList("2H", "3D", "5S", "9C", "KD"));
        assertEquals("White wins!", poker.compareHands(withePlayerCards, blackPlayerCards));
    }

    @Test
    public void checkFlush() {
        ArrayList<String> withePlayerCards = new ArrayList(asList("2H", "3H", "4H", "8H", "AH"));
        ArrayList<String> blackPlayerCards = new ArrayList(asList("2H", "3D", "5S", "9C", "KD"));
        assertTrue(poker.whiteHasFlush(withePlayerCards, blackPlayerCards));
    }
}