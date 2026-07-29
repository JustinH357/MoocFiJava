import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
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

        // find the smallest number
        int smallestNumber = numberList.get(0);
        for (int index = 0; index < numberList.size(); index++) {
            number = numberList.get(index);

            // if the number is not greater than the next number, it is the smallest
            if (smallestNumber > number) smallestNumber = number;
        }
        System.out.println("Smallest number: " + smallestNumber);

        // find which index the smallest number is at
        for (int index = 0; index < numberList.size(); index++) {
            number = numberList.get(index);

            if (number == smallestNumber) System.out.println("Found at index " + index);
        }
    }
}
