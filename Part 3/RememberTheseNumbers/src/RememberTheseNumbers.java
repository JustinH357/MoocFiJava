import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
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

        for (int i = 0; i < numberList.size(); i++) {
            number = numberList.get(i);
            System.out.println(number);
        }
    }
}
