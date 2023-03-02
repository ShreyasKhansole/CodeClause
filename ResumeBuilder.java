
/*
 Hello guys.
 my name is Shreyas Khansole.
 I am Completed Code Close task 1. 
 Project Name is Resume Builder.
 */
import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        try (// create a scanner to get user input
                Scanner scanner = new Scanner(System.in)) {
            // get user's name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // get user's contact information
            System.out.print("Enter your email address: ");
            String email = scanner.nextLine();
            System.out.print("Enter your phone number: ");
            String phone = scanner.nextLine();

            // get user's education information
            System.out.print("Enter your highest degree: ");
            String degree = scanner.nextLine();
            System.out.print("Enter your university: ");
            String university = scanner.nextLine();
            System.out.print("Enter your graduation year: ");
            int graduationYear = scanner.nextInt();

            // output the user's information
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Degree: " + degree);
            System.out.println("University: " + university);
            System.out.println("Graduation year: " + graduationYear);
        }
    }
}
