import java.util.Scanner;

public class PersonalDetails {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int nameLength = 0;
        String longestName = " ";

        while (true) {
            String input = scanner.nextLine();
            String[] namesWithYear = input.split(",");

            if (input.isEmpty()) {
                break;
            }

            if (nameLength < namesWithYear[0].length()) {
                // if name length is less than the next person's name, set nameLength to that person
                nameLength = namesWithYear[0].length();

                // set the person's longest name to longestName
                longestName = namesWithYear[0];
            }

            // get the year in array and store as int
            int year = Integer.valueOf(namesWithYear[1]);
            sum += year;
            count++;
        }

        System.out.println("Longest name: " + longestName);

        double averageYear = (double) sum / count;
        System.out.println("Average of the birth years: " + averageYear);
    }
}
