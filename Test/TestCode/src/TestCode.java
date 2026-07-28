import java.util.Scanner;

// This is where I run any code from the course to mess around with, quizzes, etc

public class TestCode {
    public static void printAverageValue() {
        Scanner scanner = new Scanner(System.in);
        int values = 0;
        int sum = 0;

        while (true) {
            System.out.println("Provide a value, a negative value ends the program");
            int value = Integer.valueOf(scanner.nextLine());
            if (value < 0) {
                break;
            }

            values = values + 1;
            sum = sum + value;
        }

        if (sum == 0) {
            System.out.println("The average of the values could not be calculated.");
        } else {
            System.out.println("Average of values: " + (1.0 * sum / values));
        }

        // 0\n-1\n is the bug because the avg can be 0. I wrote it out the code on paper and did the calcs
        // and realize you can do the calc for 0 but didn't realize if it was actually a bug until
        // i noticed that the println says "avg cant be calc" which is false. Tricky one indeed and like the
        // course says, this is perceptual blindness.
        // I did figure why sum == 0 is the guard since we don't want to divide by zero which is values meaning
        // instead of sum == 0, it should've been values == 0 as the guard.
    }

    public static void burgerChainApp() {
        // i would change x and y variable name since its confusing what they do
        // as I look at the if loop conditions. The prompt says "in addition" so I am assuming
        // if both every 2000th and 25th customer after 1k, they get both gift cards.
        // Another error I found is that if someone is 2000th customer, only the gift was printed instead of large gift.
        Scanner readInput = new Scanner(System.in);
        System.out.print("Customer number: ");
        int customerNumber = Integer.valueOf(readInput.nextLine());

        if (customerNumber >= 1000 && customerNumber % 25 == 0 && customerNumber % 2000 == 0) System.out.println("Gets a gift card and large gift card!");
        else if (customerNumber >= 1000 && customerNumber % 25 == 0) System.out.println("Gets a gift card!");
        else if (customerNumber % 2000 == 0) System.out.println("Gets a large gift card!");
        else System.out.println("Gets nothing.");
    }

    static void main(String[] args) {
        burgerChainApp();
    }
}
