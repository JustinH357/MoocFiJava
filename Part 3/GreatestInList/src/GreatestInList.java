import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
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

        int biggestNumber = numberList.get(0);
        for (int i = 0; i < numberList.size(); i++) {
            number = numberList.get(i);

            // if the number is not smaller than the next number, it is the biggest one
            if (biggestNumber < number) biggestNumber = number;
        }

        System.out.println(biggestNumber);
    }
}
