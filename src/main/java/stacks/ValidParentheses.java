package stacks;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if:
    1. Open brackets must be closed by the same type of brackets.
    2. Open brackets must be closed in the correct order.
    3. Every close bracket has a corresponding open bracket of the same type.
     */
    public boolean solve(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> closeToOpenParens = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (closeToOpenParens.containsKey(s.charAt(i))) {
                if (characterStack.isEmpty() || !characterStack.peek().equals(closeToOpenParens.get(s.charAt(i)))) {
                    return false;
                }
                characterStack.pop();
            } else {
                characterStack.add(s.charAt(i));
            }
        }

        return characterStack.isEmpty();
    }
}
