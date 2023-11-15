public class Dec2Hex {

    public static void main(String args[]) {
        // Check if any arguments are provided
        if (args.length == 0) {
            // If not, print an error message and exit with status code 1 (error)
            System.err.println("Error: No input argument provided.");
            System.exit(1);
        }

        try {
            // Try to parse the first argument as an integer and convert it to Hex
            String hexValue = convertToHex(args[0]);
            System.out.println("Hexadecimal representation is: " + hexValue);
        } catch (NumberFormatException e) {
            // If a NumberFormatException is thrown, handle it by printing an error message
            // This catches the case where the argument is not an integer
            System.err.println("Error: Non-Integer input provided.");
            // Exit with error code
            // System.exit(1);    
        }
    }

    public static String convertToHex(String decimalInput) {
        int num = Integer.parseInt(decimalInput);
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";
        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }
        return hexadecimal;
    }
}
