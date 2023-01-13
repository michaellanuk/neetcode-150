package stacks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @ParameterizedTest
    @ValueSource(strings = {"(((()[]{})))", "([{}])", "()"})
    public void testTrue(String s) {
        assertTrue(validParentheses.solve(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"(]", ")(", "[[[]]]]"})
    public void testFalse(String s) {
        assertFalse(validParentheses.solve(s));
    }
}
