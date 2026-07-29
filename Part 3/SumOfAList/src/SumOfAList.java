import java.util.ArrayList;
import java.util.Scanner;

// Combined with "Average of a list" exercise.

public class SumOfAList {
    static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        int userNumber;
        int sum = 0;
        double average;

        System.out.println("Enter number (-1 to exit):");
        while (true) {
            userNumber = Integer.valueOf(reader.nextLine());

            if (userNumber == -1) break;

            numberList.add(userNumber);
        }

        // foreach loop
        for (int number: numberList) sum += number;
        System.out.print("Sum: " + sum);

        // create spacing
        System.out.println(" ");

        average = (double) sum / numberList.size();
        System.out.print("Average: " + average);
    }
}
