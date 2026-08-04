import java.util.Scanner;

public class LineByLine {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // could move these inside the while loop since I am not using them outside of the loop
        String input;
        String[] words;

        while (true) {
            input = scanner.nextLine();
            words = input.split(" ");

            if (input.isEmpty()) break;

            for (String word: words) System.out.println(word);
        }
    }
}
