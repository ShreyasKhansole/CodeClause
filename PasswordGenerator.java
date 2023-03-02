/*
 Hello guys.
 my name is Shreyas Khansole.
 I am Completed Code Close task 2.
 Project Name is Password Generator using Java.
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        try (// Initialize variables
                Scanner scanner = new Scanner(System.in)) {
            int length;
            String password;

            // Get password length from user
            System.out.print("Enter password length: ");
            length = scanner.nextInt();

            // Generate password
            password = generatePassword(length);

            // Output password
            System.out.println("Generated password: " + password);
        }
    }

    private static String generatePassword(int length) {
        // Define character set
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;':\",./<>?\\";

        // Initialize secure random generator
        SecureRandom random = new SecureRandom();

        // Generate password
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
}
