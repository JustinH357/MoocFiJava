import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        String name;

        System.out.println(" Write name (press enter no name to exit): ");
        while (true) {
            name = reader.nextLine();

            if (name.isEmpty()) break;

            nameList.add(name);
        }

        // get 3rd index of list
        System.out.println(nameList.get(2));

    }
}
