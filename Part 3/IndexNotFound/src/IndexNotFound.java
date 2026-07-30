import java.util.Scanner;

public class IndexNotFound {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.print("Search for? ");
        int number = Integer.valueOf(scanner.nextLine());

        // track how many times, the number was not found
        int notFound = 0;

        // decided to do boolean check if numbers are found
        // boolean check looks better and easy to understand compare to tracking if
        // a number was not found 5 / 5 (based on the array size) times
        //boolean found = false;

        // prints out the index if element found, else increment index of element "notFound"
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) System.out.println(number + " is at index " + i);
            else notFound++;

            // if number is found print index and set "found" to true
//            if (numbers[i] == number) {
//                System.out.println(number + " is at index " + i);
//                found = true;
//            }
        }

        // if the number of "notFound" is 5 (the array size), that means the number was not found
        if (notFound == numbers.length) System.out.println(number + " was not found.");

        // if no numbers were found (found=false) print not found
        //if (!found) System.out.println(number + " was not found.");
    }
}
