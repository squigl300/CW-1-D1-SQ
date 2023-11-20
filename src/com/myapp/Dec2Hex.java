package com.myapp; // Package name added to address SonarQube issue about unnamed package

import java.util.logging.Logger; // Import the Logger
import com.myapp.Dec2Hex;

/**
 * The Dec2Hex class provides a method to convert a decimal number to its hexadecimal representation.
 */
public class Dec2Hex {

    // Create a Logger to replace System.out and System.err as per SonarQube's suggestions
    private static final Logger LOGGER = Logger.getLogger(Dec2Hex.class.getName());

    /**
     * Converts an integer to a hexadecimal string.
     * Resolves SonarQube issue 2: Uses StringBuilder instead of String concatenation in loops for better performance.
     * @param number the integer number to convert.
     * @return the hexadecimal representation as a string.
     */
    public static String convertToHex(int number) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        StringBuilder hexadecimal = new StringBuilder(); // StringBuilder used instead of string concatenation
        while (number != 0) {
            rem = number % 16;
            hexadecimal.insert(0, ch[rem]);  // Prepending the character for the current hexadecimal digit
            number = number / 16;
        }
        return hexadecimal.toString();
    }

    /**
     * Main method that parses the command-line argument and prints the hexadecimal representation.
     * Exits with error code 1 if no arguments are provided or if the argument is not an integer.
      * Resolves SonarQube issue 3: Replace uses of System.out and System.err with logger functions.
     * @param args command-line arguments, expects a single integer as the first argument.
     */
    public static void main(String[] args) {
        // Resolves SonarQube issue 4: Check for the absence of command-line arguments
        if (args.length == 0) {
            LOGGER.severe("Error: No input argument provided."); // Replaced System.err with LOGGER.severe
            System.exit(1);
        }
        try {
            int arg1 = Integer.parseInt(args[0]);
            LOGGER.info("Converting the Decimal Value " + arg1 + " to Hex..."); // Replaced System.out with LOGGER.info
            LOGGER.info("Hexadecimal representation is: " + convertToHex(arg1)); // Replaced System.out with LOGGER.info
        } catch (NumberFormatException e) {  
            // Handles non-integer inputs and logs error without exiting the program abruptly
            LOGGER.severe("Error: Non-Integer input provided."); // Replaced System.err with LOGGER.severe
        }
    }
} 
