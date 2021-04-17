package homework.decisions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightColorDetectorTest {

    @Test
    void detectTest() {
        int userInput = 666;
        String expected = "Red";
        assertEquals(expected, LightColorDetector.detect(userInput));
    }
}