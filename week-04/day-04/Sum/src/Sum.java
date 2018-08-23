import java.util.ArrayList;
import java.util.List;

public class Sum {
    public List<Integer> listName;

    public Sum (){
        this.listName = listName;
    }

    public int sumElements(ArrayList<Integer> listOfSum) {
        int sumElements = 0;
        for (int i = 0; i < listOfSum.size(); i++) {
            sumElements += listOfSum.get(i);
        }
        return sumElements;
    }
}
