import java.util.ArrayList;
import java.util.List;

public class Multiples {
    public List<Integer> putInList(int from, int to, int numberMultiple) {
        List<Integer> placeholder = new ArrayList<>() ;
        if (to > from) {
            for (int i = from; i <= to; i++) {
                if (i % numberMultiple == 0) {
                    placeholder.add(i);
                }
            }
            return placeholder;
        }
        else{
            throw new IllegalArgumentException("The second number must be grater than the first number");
        }
    }
}
