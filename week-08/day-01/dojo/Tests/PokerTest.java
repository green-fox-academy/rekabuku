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

    @Test
    public void checkNine() {
        ArrayList<String> withePlayerCards = new ArrayList(asList("2C", "3H", "4S", "8C", "KH"));
        ArrayList<String> blackPlayerCards = new ArrayList(asList("2H", "3D", "5S", "9C", "KD"));
        assertEquals("Black wins!", poker.checkHigherCard(withePlayerCards, blackPlayerCards));
    }

    @Test
    public void tie() {
        ArrayList<Card> white = new ArrayList();
        ArrayList<Card> black = new ArrayList();
        Card card1 = new Card("2", "H");
        Card card2 = new Card("3", "D");
        Card card3 = new Card("5", "S");
        Card card4 = new Card("9", "C");
        Card card5 = new Card("K", "D");
        white.add(card1);
        white.add(card2);
        white.add(card3);
        white.add(card4);
        white.add(card5);
        Card card6 = new Card("2", "D");
        Card card7 = new Card("3", "H");
        Card card8 = new Card("5", "C");
        Card card9 = new Card("9", "S");
        Card card10 = new Card("K", "H");
        black.add(card6);
        black.add(card7);
        black.add(card8);
        black.add(card9);
        black.add(card10);
        assertEquals("Tie", poker.checkIfTie(white, black));
    }
}