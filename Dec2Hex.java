/**
 * The Dec2Hex class provides a method to convert a decimal number to its hexadecimal representation.
 */
public class Dec2Hex {

    /**
     * Converts an integer to a hexadecimal string.
     * @param number the integer number to convert.
     * @return the hexadecimal representation as a string.
     */
    public static String convertToHex(int number) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";
        while (number != 0) {
            rem = number % 16;
            hexadecimal = ch[rem] + hexadecimal;
            number = number / 16;
        }
        return hexadecimal;
    }

    /**
     * Main method that parses the command-line argument and prints the hexadecimal representation.
     * Exits with error code 1 if no arguments are provided or if the argument is not an integer.
     * @param args command-line arguments, expects a single integer as the first argument.
     */
    public static void main(String args[]) {
        if (args.length == 0) {
            System.err.println("Error: No input argument provided.");
            System.exit(1);
        }
        try {
            int arg1 = Integer.parseInt(args[0]);
            System.out.println("Converting the Decimal Value " + arg1 + " to Hex...");
            System.out.println("Hexadecimal representation is: " + convertToHex(arg1));
        } catch (NumberFormatException e) {
            System.err.println("Error: Non-Integer input provided.");
        }
    }
}

