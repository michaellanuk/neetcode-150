package arraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {
    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void testTrue() {
        String s = "anagram";
        String t = "nagaram";

        assertTrue(validAnagram.solve(s, t));
    }

    @Test
    public void testFalse() {
        String s = "rat";
        String t = "car";

        assertFalse(validAnagram.solve(s, t));
    }

    @Test
    public void testDifferentLengths() {
        String s = "two";
        String t = "three";

        assertFalse(validAnagram.solve(s, t));
    }
}
