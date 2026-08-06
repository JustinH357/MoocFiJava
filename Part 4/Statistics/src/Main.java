import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (-1 to exit): ");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            statistics.addNumber(input);

            if (input % 2 == 0) {
                even.addNumber(input);
            } else {
                odd.addNumber(input);
            }
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " +odd.sum());

    }
}
