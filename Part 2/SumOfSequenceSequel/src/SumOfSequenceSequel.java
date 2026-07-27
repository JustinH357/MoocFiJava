import java.util.Scanner;

public class SumOfSequenceSequel {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number?: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.print("Second number? (must be greater than first number): ");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        // add by incrementing to the next number
        for (int i = firstNumber; i <= secondNumber; i++) sum += i;

        System.out.print("The sum is: " + sum);
    }
}
