import java.util.Scanner;

public class OnlyPositives {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // ask for the number
            System.out.print("Give a number (0 to exit): ");
            int number = Integer.valueOf(scanner.nextLine());

            // exit loop
            if (number == 0) break;

            // repeat loop if negative number
            if (number < 0) {
                System.out.println("Unsuitable number.");
                continue;
            }

            // power of two (times by itself)
            System.out.println(number * number);
        }
    }
}
