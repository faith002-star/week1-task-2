import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * UserDetails.java
 * Collects height, bank balance, and phone number from the user.
 */
public class UserDetails {
    public static void main(String[] args) {
        // Initialize Scanner for input
        Scanner input = new Scanner(System.in);
        
        // Formatter for currency (Ksh #,###.00)
        DecimalFormat currencyFormat = new DecimalFormat("#,###.00");

        System.out.println("=== Please Enter Your Details ===");

        // i. Height (float)
        System.out.println("Enter your height (e.g., 1.75 in meters): ");
        float height = input.nextFloat();

        // ii. Bank Balance (double)
        System.out.println("Enter your bank balance (Kenya Shillings): ");
        double balance = input.nextDouble();

        // Consume the leftover newline character
        input.nextLine(); 

        // iii. Phone Number (String)
        System.out.println("Enter your phone number: ");
        String phoneNumber = input.nextLine();

        // --- Displaying the Results ---
        System.out.println("\n--- Collected User Information ---");
        System.out.println("Height:        " + height + " meters");
        System.out.println("Bank Balance:  Ksh " + currencyFormat.format(balance));
        System.out.println("Phone Number:  " + phoneNumber);

        // Close scanner
        input.close();
    }
}