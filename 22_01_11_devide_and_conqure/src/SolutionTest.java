import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testMergeSort() {
        int[] array1 = {5, 10, -3, 21, -11, 0, 6, 17, 8};
        int[] array2 = {-11, -3, 0, 5, 6, 8, 10, 17, 21};

        solution.mergeSort(array1);
        assertArrayEquals(array1, array2);
        for (int i = 0; i < array1.length; i++) {
            assertEquals(array1[i], array2[i]);
            System.out.println(array1[i] + " ");
        }
    }

    @Test
    public void testFindDom_positive() {
        int[] array = {2, 2, 2, 3, 2, 3};
        assertEquals(2, solution.findDominant(array));
    }

    @Test
    public void testFindDom_negative() {
        int[] array = {2, 2, 3, 3, 2, 3};
        assertEquals(-1, solution.findDominant(array));
    }
}