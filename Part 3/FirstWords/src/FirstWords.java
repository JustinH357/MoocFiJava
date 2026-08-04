import java.util.Scanner;

// Combined with exercise LastWords.

public class FirstWords {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] words = input.split(" ");

            if (input.isEmpty()) {
                break;
            }

            // print only the first part of string
            System.out.println(words[0]);
            // print the last element in the string array
            System.out.println(words[words.length-1]);
        }
    }
}
