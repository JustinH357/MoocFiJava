import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        String name;
        System.out.println("Enter name:");
        while (true) {
            name = reader.nextLine();

            if (name.isEmpty()) break;

            nameList.add(name);
        }

        System.out.print("Search for? ");
        String searchName = reader.nextLine();

        if (nameList.contains(searchName)) System.out.println(searchName + " was found!");
        else System.out.println(searchName + " was not found!");
    }
}
