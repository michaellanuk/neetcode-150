package twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {
    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void testTrue() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.solve(s));
    }

    @Test
    public void testFalse() {
        String s = "race a car";
        assertFalse(validPalindrome.solve(s));
    }
}
