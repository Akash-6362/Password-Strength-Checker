import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     PASSWORD STRENGTH CHECKER");
        System.out.println("=================================");

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;

        // Check password length
        if (password.length() >= 8) {
            score++;
        }

        // Check uppercase letters
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Check lowercase letters
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Check numbers
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        // Check special characters
        if (password.matches(".*[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/].*")) {
            score++;
        }

        // Display strength
        System.out.println("\nPassword Analysis Result:");

        if (score <= 2) {
            System.out.println("Password Strength: WEAK");
            System.out.println("Suggestion:");
            System.out.println("- Use at least 8 characters");
            System.out.println("- Add uppercase and lowercase letters");
            System.out.println("- Include numbers and special characters");
        }
        else if (score == 3 || score == 4) {
            System.out.println("Password Strength: MEDIUM");
            System.out.println("Suggestion:");
            System.out.println("- Add more security features");
            System.out.println("- Use special characters for better protection");
        }
        else {
            System.out.println("Password Strength: STRONG");
            System.out.println("Excellent! Your password is secure.");
        }

        sc.close();
    }
}