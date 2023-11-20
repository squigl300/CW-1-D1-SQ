package com.myapp; // Package name added to address SonarQube issue about unnamed package

import static org.junit.Assert.assertEquals; // Import assert methods
import org.junit.Test; // Import JUnit4 annotation

/**
 * Test class for Dec2Hex. It uses JUnit4 to run tests against the convertToHex method.
 */
public class Dec2HexTest {

    /**
     * Test for the convertToHex method. Checks if the correct hexadecimal string is returned.
     */
    @Test
    public void testConvertToHex() {
        // Example test case
        int input = 15; // Decimal input
        String expectedOutput = "F"; // Expected hexadecimal output
        String actualOutput = Dec2Hex.convertToHex(input); // Perform the conversion using Dec2Hex method

        // Assert that the expected output matches the actual output
        // Resolves SonarQube issue: Use of assert statements for testing
        assertEquals("The hexadecimal conversion of " + input + " should be " + expectedOutput, 
                     expectedOutput, actualOutput);
    }
}
