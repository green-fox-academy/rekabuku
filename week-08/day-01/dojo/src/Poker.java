import java.util.ArrayList;

public class Poker {
    private String myString = "";

    public String compareHands(ArrayList<String> white, ArrayList<String> black) {
        for (int i = 0; i < white.size(); i++) {
            if (white.get(i).startsWith("A") && !black.get(i).startsWith("A")) {
                myString = "White wins!";
            } else if (black.get(i).startsWith("A") && !white.get(i).startsWith("A")) {
                myString = "Black wins!";
            } else myString = "Klarikam osszal mar, szivem";

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
        if (numsWithe.contains(0)){
            return false;
        }
        return true;
    }
}
