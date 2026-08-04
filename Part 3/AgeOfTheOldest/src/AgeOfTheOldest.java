import java.util.Scanner;

// Combined with "name of the oldest" exercise.

public class AgeOfTheOldest {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestName = " ";

        while (true) {
            String input = scanner.nextLine();
            String[] namesWithAges = input.split(",");

            if (input.isEmpty()) {
                break;
            }

            // convert the 2nd element which is age to int and store it to the age variable
            int age = Integer.valueOf(namesWithAges[1]);

            // if oldest is younger than the next person's age, set that person as the oldest and get their name
            if (oldest < age) {
                oldest = age;
                oldestName = namesWithAges[0];
            }
        }

        System.out.println("Age of the oldest: " + oldest);
        System.out.println("Name of the oldest: " + oldestName);
    }
}
