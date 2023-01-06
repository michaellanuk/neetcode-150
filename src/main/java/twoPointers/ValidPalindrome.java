package twoPointers;

public class ValidPalindrome {
    public ValidPalindrome() {};

    private static final String ALPHANUMERIC_PATTERN = "[a-zA-Z0-9]+";

    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
    removing all non-alphanumeric characters, it reads the same forward and backward.
    Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
     */
    public boolean solve(String s) {
        if (s.length() <= 1) {
            return true;
        }

        StringBuilder onlyAlphaNum = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                onlyAlphaNum.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        for (int i = 0; i < onlyAlphaNum.length() / 2; i++) {
            if (onlyAlphaNum.charAt(i) != onlyAlphaNum.charAt(onlyAlphaNum.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
