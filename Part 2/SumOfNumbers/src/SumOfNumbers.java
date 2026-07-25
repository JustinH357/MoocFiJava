import java.util.Scanner;

public class SumOfNumbers {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // keep track of sum of number
        int sum = 0;

        while (true) {
            System.out.print("Give a number (0 to exit): ");
            int number = Integer.valueOf(scanner.nextLine());

            // exit loop
            if (number == 0) break;

            // same as sum = sum + number
            sum += number;
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
