import java.util.ArrayList;
import java.util.List;

public class Joiners {
    public static <R> R fold(List<R> list, Joiner<R> joiner){
        R result= list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = joiner.join(result, list.get(i));
        }
        return result;
    }
}
