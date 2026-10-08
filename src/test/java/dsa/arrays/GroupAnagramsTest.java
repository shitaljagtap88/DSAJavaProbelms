package dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class GroupAnagramsTest {

    @Test
    void groupsClassicExample() {
        List<List<String>> grouped =
                GroupAnagrams.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
        Set<Set<String>> actual = asSets(grouped);
        assertEquals(
                Set.of(Set.of("eat", "tea", "ate"), Set.of("tan", "nat"), Set.of("bat")), actual);
    }

    @Test
    void singleEmptyString() {
        List<List<String>> grouped = GroupAnagrams.groupAnagrams(new String[] {""});
        assertEquals(1, grouped.size());
        assertEquals(List.of(""), grouped.get(0));
    }

    @Test
    void allUnique() {
        List<List<String>> grouped = GroupAnagrams.groupAnagrams(new String[] {"a", "b"});
        assertEquals(2, grouped.size());
        assertTrue(asSets(grouped).contains(Set.of("a")));
        assertTrue(asSets(grouped).contains(Set.of("b")));
    }

    private static Set<Set<String>> asSets(List<List<String>> grouped) {
        return grouped.stream().map(HashSet::new).collect(Collectors.toSet());
    }
}
