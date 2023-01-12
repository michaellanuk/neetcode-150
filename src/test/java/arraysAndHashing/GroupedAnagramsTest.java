package arraysAndHashing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupedAnagramsTest {
    GroupedAnagrams groupedAnagrams = new GroupedAnagrams();

    @Test
    public void testSolve() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("tan", "nat"));
        expected.add(Arrays.asList("eat", "tea", "ate"));
        expected.add(Arrays.asList("bat"));

        assertEquals(groupedAnagrams.solve(strs), expected);
    }

    @Test
    public void testSingle() {
        String[] strs = {"a"};

        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("a"));

        assertEquals(groupedAnagrams.solve(strs), expected);
    }

    @Test
    public void testEmpty() {
        String[] strs = {""};

        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList(""));

        assertEquals(groupedAnagrams.solve(strs), expected);
    }
}
