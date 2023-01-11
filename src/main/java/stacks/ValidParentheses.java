package stacks;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public ValidParentheses() {}

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
