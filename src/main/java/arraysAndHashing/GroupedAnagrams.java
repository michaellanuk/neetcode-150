package arraysAndHashing;

import java.util.*;

public class GroupedAnagrams {

    /*
    Given an array of strings strs, group the anagrams together.
    You can return the answer in any order.

    An Anagram is a word or phrase formed by rearranging the letters of
    a different word or phrase, typically using all the original letters exactly once.
     */
    public List<List<String>> solve(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String s : strs) {
            char[] characters = new char[26];

            for (char c : s.toCharArray()) {
                characters[c - 'a']++;
            }

            String key = new String(characters);
            anagramsMap.computeIfAbsent(key, k -> new ArrayList<>());
            anagramsMap.get(key).add(s);
        }

        return new ArrayList<>(anagramsMap.values());
    }
}
