import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public void testSolve_oneElement_segment5() {
        int[] numbers = {3};
        int res = Task1.getSegmentNumber(numbers, 5);

        assertEquals(res, 1);
    }

    @Test
    public void testSolve_severalElements_segment1() {
        int[] numbers = {3, 5, 7, 9, 14};
        int res = Task1.getSegmentNumber(numbers, 1);

        assertEquals(res, 5);
    }

    @Test
    public void testSolve_severalElements_longSegment() {
        int[] numbers = {3, 5, 7, 9, 14};
        int res = Task1.getSegmentNumber(numbers, 20);

        assertEquals(res, 1);
    }

    @Test
    public void testSolve_severalElements_segment7() {
        int[] numbers = {3, 5, 7, 9, 14};
        int res = Task1.getSegmentNumber(numbers, 7);

        assertEquals(res, 2);
    }



}