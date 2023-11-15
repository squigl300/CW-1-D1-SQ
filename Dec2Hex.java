// Import the Scanner class for input handling
import java.util.Scanner;

// The Dec2Hex class contains the main method and the logic for converting
// a decimal number to its hexadecimal representation.
public class Dec2Hex {

    // The main method is the entry point of the program.
    public static void main(String args[]) {
        // Check if any arguments are provided
        if (args.length == 0) {
            // If not, print an error message to standard error stream and exit with status code 1 (error)
            System.err.println("Error: No input argument provided.");
            System.exit(1);
        }

        try {
            // Try to parse the first argument as an integer
            int arg1 = Integer.parseInt(args[0]);
            // Array of characters representing hexadecimal digits
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            // Variable to hold the remainder of the division by 16
            int rem;
            // Copy of the argument to be used in the conversion process
            int num = arg1;
            // String to build the hexadecimal representation
            String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            // Loop to process the number until it's fully converted
            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }

            // Output the hexadecimal representation
            System.out.println("Hexadecimal representation is: " + hexadecimal);

        } catch (NumberFormatException e) {
            // If a NumberFormatException is thrown, print an error message
            // This happens when the argument is not a valid integer
            System.err.println("Error: Non-Integer input provided.");
            // Exit with status code 1 (error)
            System.exit(1);
        }
    }
}
