import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
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

        System.out.print("From Where? ");
        int start = Integer.valueOf(reader.nextLine());
        System.out.print("To Where? ");
        int end = Integer.valueOf(reader.nextLine());

        for (int i = start; i <= end; i++) {
            number = numberList.get(i);
            System.out.println(number);
        }
    }
}
