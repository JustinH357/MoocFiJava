import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        int sum;
        int userNumber;

        System.out.println("Enter number (0 to exit):");
        while (true) {
            userNumber = Integer.valueOf(reader.nextLine());

            if (userNumber == 0) break;

            numberList.add(userNumber);
        }

        // add 2nd and 3rd value from list
        sum = numberList.get(1) + numberList.get(2);
        System.out.println(sum);
    }
}
