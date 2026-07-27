import java.util.Scanner;

public class RepeatingBreakingRemembering {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variables
        int sum = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Write numbers:");

        while (true) {
            int userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber == -1) break;

            // checks for even or odd numbers
            if (userNumber % 2 == 0) even++;
            else odd++;

            // calculations
            sum += userNumber;
            count++;
            average = (double) sum / count;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
