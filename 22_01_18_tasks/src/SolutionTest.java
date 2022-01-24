import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testContainsProduct_positive() {
        int[] array = {2, 5, 18, 50};

        assertTrue(solution.containsProduct(array, 36));
    }

    @Test
    public void testContainsProduct_positive2() {
        int[] array = {2, 5};

        assertTrue(solution.containsProduct(array, 10));
    }

    @Test
    public void testContainsProduct_negative() {
        int[] array = {2, 5, 18, 50};

        assertFalse(solution.containsProduct(array, 40));
    }

    @Test
    public void testEncode_() {
        String str = "aaaabbcccd";
        assertEquals("4a2b3cd", solution.encode(str));
        System.out.println(solution.encode(str));
    }

    @Test
    public void testEncode_2() {
        String str = "abcdddeff";
        assertEquals("abc3de2f", solution.encode(str));
        System.out.println(solution.encode(str));
    }
}