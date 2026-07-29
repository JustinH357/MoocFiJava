import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        int userNumber;
        int number;

        System.out.println("Enter number (-1 to exit):");
        while (true) {
            userNumber = Integer.valueOf(reader.nextLine());

            if (userNumber == -1) break;

            numberList.add(userNumber);
        }

        System.out.print("Search for? ");
        int searchNumber = Integer.valueOf(reader.nextLine());

        for (int index = 0; index < numberList.size(); index++) {
            number = numberList.get(index);

            if (number == searchNumber) System.out.println(number + " is at index " + index);
        }
    }
}
