package arraysAndHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ValidAnagram {
    public ValidAnagram() {}

    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.
     */

    public boolean solve(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charMap = new HashMap<>();

        IntStream.range(0, s.length()).forEach(i -> {
            charMap.merge(s.charAt(i), 1, Integer::sum);
            charMap.merge(t.charAt(i), -1, Integer::sum);
        });

        return charMap.values().stream().noneMatch(count -> count != 0);
    }
}
