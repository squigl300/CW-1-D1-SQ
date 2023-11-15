import org.junit.Assert;
import org.junit.Test;

public class Dec2HexTest {

    @Test
    public void testValidInput() {
        // Arrange
        String input = "15";
        String expectedOutput = "F";
        
        // Act
        String actualOutput = Dec2Hex.convertToHex(input);
        
        // Assert
        Assert.assertEquals(expectedOutput, actualOutput);
    }
    
    // Additional test methods will go here
}
