import java.util.Scanner;

public class Swap {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for (int number: numbers) System.out.println(number);

        System.out.println("");

        System.out.println("Give two indices to swap");
        int firstIndex = Integer.valueOf(scanner.nextLine());
        int secondIndex = Integer.valueOf(scanner.nextLine());

        // temporary store the first index given by user
        int temp = numbers[firstIndex];
        // swap the two given index
        numbers[firstIndex] = numbers[secondIndex];
        // store the second index given by the user to the first index stored
        numbers[secondIndex] = temp;

        System.out.println("");

        // print the updated array of numbers
        for (int number: numbers) System.out.println(number);
    }
}
