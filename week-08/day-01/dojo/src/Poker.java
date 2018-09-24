import java.util.ArrayList;

public class Poker {
    private String myString = "";
    Card card = new Card();

    public String compareHands(ArrayList<String> white, ArrayList<String> black) {
        for (int i = 0; i < white.size(); i++) {
            if (white.get(i).startsWith("A") && !black.get(i).startsWith("A")) {
                myString = "White wins!";
            } else if (black.get(i).startsWith("A") && !white.get(i).startsWith("A")) {
                myString = "Black wins!";
            }
        }
        return myString;
    }

    public boolean whiteHasFlush(ArrayList<String> white, ArrayList<String> black) {
        ArrayList<Integer> numsWithe = new ArrayList<>();
        ArrayList<Integer> numsBlack = new ArrayList<>();
        for (int i = 0; i < white.size(); i++) {
            if (white.get(i).endsWith("H")) {
                numsWithe.add(1);
            } else {
                numsWithe.add(0);
            }
        }
        for (int i = 0; i < black.size(); i++) {
            if (black.get(i).endsWith("H")) {
                numsBlack.add(1);
            } else {
                numsBlack.add(0);
            }
        }
        if (numsWithe.contains(0)) {
            return false;
        }
        return true;
    }

    public String checkHigherCard(ArrayList<String> white, ArrayList<String> black) {
        for (int i = 0; i < black.size(); i++) {
            if (black.get(i).startsWith("9") && !white.get(i).startsWith("9")) {
                myString = "Black wins!";
            } else if (white.get(i).startsWith("9") && !black.get(i).startsWith("9")) {
                myString = "White wins!";
            }
        }
        return myString;
    }

    public String checkIfTie(ArrayList<Card> white, ArrayList<Card> black) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < white.size(); i++) {
            if (white.get(i).getValue().equals(black.get(i).getValue())) {
               num.add(1);
            } else if (!white.get(i).getValue().equals(black.get(i).getValue())) {
                num.add(0);
            }
            if (!num.contains(0)) {
                myString = "Tie";
            } else {
                myString = "Not tie";
            }
        }
        return myString;
    }

}