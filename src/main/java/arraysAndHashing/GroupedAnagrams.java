package arraysAndHashing;

import java.util.*;

public class GroupedAnagrams {
    public GroupedAnagrams() {}

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

        List<List<String>> groupedAnagrams = new ArrayList<>();
        groupedAnagrams.addAll(anagramsMap.values());

        return groupedAnagrams;
    }
}
