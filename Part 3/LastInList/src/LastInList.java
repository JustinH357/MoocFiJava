import java.util.ArrayList;
import java.util.Scanner;

// Combined with "First and Last" exercise. Not sure if they wanted us to use size() to get the first element.

public class LastInList {
    static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        String name;
        int lastIndex;
        int firstIndex;
        String lastElement;
        String firstElement;

        System.out.println("Enter number (no name press enter to exit):");
        while (true) {
            name = reader.nextLine();

            if (name.isEmpty()) break;

            nameList.add(name);
        }

        // storing the last index in list
        lastIndex = nameList.size() - 1;
        // size() to be 0
        firstIndex = (nameList.size() - lastIndex) - 1;

        lastElement = nameList.get(lastIndex);
        firstElement = nameList.get(firstIndex);

        System.out.println(lastElement);
        System.out.println(firstElement);
    }
}
