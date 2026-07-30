import java.util.ArrayList;

public class RemoveLast {
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) return;

        // remove last value in list
        // could do .removeLast()
        strings.remove(strings.size()-1);
    }

    static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
}
