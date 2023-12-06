import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Maia");
        listString.add("Lia");
        Joiner<String> stringJoiner = new StringJoiner();
        Joiners joiners = new Joiners();
        String result = joiners.fold(listString, stringJoiner);
        System.out.println(result);

        Joiners joiners2 = new Joiners();
        List<Integer> IntegerList = new ArrayList<>();
        IntegerList.add(1);
        IntegerList.add(2);
        IntegerList.add(3);
        Joiner<Integer> integerJoiner = new Joiner<Integer>() {
            @Override
            public Integer join(Integer r1, Integer r2) {
                return r1+r2;
            }
        };
        Integer result2 = joiners2.fold(IntegerList, integerJoiner);
        System.out.println(result2);
    }
}