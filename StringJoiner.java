public class StringJoiner implements Joiner<String>{
    @Override
    public String join(String string1, String string2) {
        String result = string1 + " " + string2;
        return result;
    }
}
