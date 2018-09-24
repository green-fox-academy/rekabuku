import java.util.ArrayList;

public class Poker {
    private String myString ="";

    public String compareHands (ArrayList<String> white, ArrayList<String> black){
        for (int i = 0; i < white.size(); i++) {
            if (white.get(i).startsWith("A")&& !black.get(i).startsWith("A")){
                myString ="White wins!";
            }
            else if (black.get(i).startsWith("A")&& !white.get(i).startsWith("A")){
                myString ="Black wins!";
            }
            else myString = "Klarikam osszal mar, szivem";
                
            }

        return myString;
    }
}
