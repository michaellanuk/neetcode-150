package stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void testTrue() {
        assertTrue(validParentheses.solve("(((()[]{})))"));
        assertTrue(validParentheses.solve("([{}])"));
    }

    @Test
    public void testFalse() {
        assertFalse(validParentheses.solve("(]"));
        assertFalse(validParentheses.solve(")("));
    }
}
