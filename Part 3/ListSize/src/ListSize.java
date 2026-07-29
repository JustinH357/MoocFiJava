import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        int size;
        String name;

        System.out.println("Enter number (no name press enter to exit):");
        while (true) {
            name = reader.nextLine();

            if (name.isEmpty()) break;

            nameList.add(name);
        }

        size =  nameList.size();
        System.out.println(size);
    }
}
