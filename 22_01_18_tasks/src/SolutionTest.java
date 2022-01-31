import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testContainsProduct() {
        int[] array = {2, 5, 18, 50, 100};

        assertTrue(solution.containsProductEff(array, 36));
        assertTrue(solution.containsProductEff(array, 5000));
        assertTrue(solution.containsProductEff(array, 250));

        assertFalse(solution.containsProductEff(array, 40));
        assertFalse(solution.containsProductEff(array, 15000));
        assertFalse(solution.containsProductEff(array, 1000000));
    }

    @Test
    public void testEncode_() {
        assertEquals("4a2b4cd", solution.encode("aaaabbccccd"));
        assertEquals("4ab4cd", solution.encode("aaaabccccd"));
        assertEquals("4a2b4c2d", solution.encode("aaaabbccccdd"));
        assertEquals("4a", solution.encode("aaaa"));
        assertEquals("10a", solution.encode("aaaaaaaaaa"));
        assertEquals("a", solution.encode("a"));
        assertEquals("", solution.encode(""));
    }

    @Test
    public void testSolutionDecode() {
        assertEquals("aaaabbccccd", solution.decode("4a2b4cd"));
        assertEquals("aaaabccccd", solution.decode("4ab4cd"));
        assertEquals("aaaabbccccdd", solution.decode("4a2b4c2d"));
        assertEquals("aaaa", solution.decode("4a"));
        assertEquals("aaaaaaaaaa", solution.decode("10a"));
        assertEquals("aaaaaaaaaaaaaaa", solution.decode("15a"));
        assertEquals("a", solution.decode("a"));
        assertEquals("", solution.decode(""));
    }
}