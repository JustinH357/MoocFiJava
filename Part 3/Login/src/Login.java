import java.util.Scanner;

public class Login {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};

        System.out.print("Enter username: ");
        String name = scanner.nextLine();
        System.out.print("Enter password: ");
        String userPassword = scanner.nextLine();

        boolean loginSuccess = false;
        // both for loops iterate through the username and password arrays
        for (int i = 0; i < username.length; i++) {
            for (int j = 0; j < password.length; j++) {
                // if both numbers are equal
                if (i == j) {
                    // compare the two arrays at the same index with both inputs are matched
                    if (username[i].equals(name) && password[j].equals(userPassword)) {
                        System.out.println("Login successfully!");
                        loginSuccess = true;
                    }
                }
            }
        }

        // if login is not successful, print
        if (!loginSuccess) System.out.println("wrong password or username!");
    }
}
