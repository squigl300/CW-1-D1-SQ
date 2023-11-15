import org.junit.Test;
import static org.junit.Assert.*;

public class Dec2HexTest {

    // Test to ensure that valid input is correctly parsed and the appropriate
    // hexadecimal value is returned.
    @Test
    public void testValidInput() {
        // The expected output for the decimal value 15 is "F".
        // The assertEquals method checks that the actual method result matches "F".
        assertEquals("F", Dec2Hex.convertToHex("15"));
    }

    // Test to ensure that invalid input throws a NumberFormatException.
    // This test is expected to pass if the NumberFormatException is thrown.
    @Test(expected = NumberFormatException.class)
    public void testInvalidInput() {
        // The following call should throw a NumberFormatException
        // because "abc" is not a valid integer.
        Dec2Hex.convertToHex("abc");
    }

    // Test to ensure that an empty string as input throws a NumberFormatException.
    // This test is expected to pass if the NumberFormatException is thrown.
    @Test(expected = NumberFormatException.class)
    public void testEmptyInput() {
        // The following call should throw a NumberFormatException
        // because an empty string is not a valid integer.
        Dec2Hex.convertToHex("");
    }
}
