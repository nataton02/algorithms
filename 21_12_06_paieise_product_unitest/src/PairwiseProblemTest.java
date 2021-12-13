import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

class PairwiseProblemTest {
    PairwiseProblem pp = new PairwiseProblem();

    @Test
    public void testSolve2_manyElements() {
        int[] array = {20, 10, 5, 1, 3, 15, 1};
        assertEquals(300, pp.solve2(array));
    }

    @Test
    public void testSolve2_emptyArray() {
        int[] array = {};
        assertEquals(0, pp.solve(array));
    }
    @Test
    public void testSolve2_oneElement() {
        int[] array = {10};
        assertEquals(0, pp.solve(array));
    }

    @Test
    public void testSolve2_twoElements() {
        int[] array = {5, 10};
        assertEquals(50, pp.solve2(array));
    }

    @Test
    public void testSolve2_twoElementsWithNegative() {
        int[] array = {5, -10};
        assertEquals(0, pp.solve2(array));
    }

    @Test
    public void testSolve2_twoNegativeElements() {
        int[] array = {-5, -10};
        assertEquals(0, pp.solve2(array));
    }

    @Test
    public void testSolve2_twoNumberWithZero() {
        int[] array = {100, 0};
        assertEquals(0, pp.solve(array));
    }

    @Test
    public void testSolve2_fourElements() {
        int[] array = {5, 10, 20, 4};
        assertEquals(200, pp.solve2(array));
    }

    @Test
    public void testSolve2_twoLargeElements() {
        int[] array = {100_000, 100_000};
        assertEquals(10_000_000_000L, pp.solve2(array));
    }






/*
    @Test
    public void testSolve_twoElements1and2() {
        int[] array = {1, 2};
        assertEquals(2, pp.solve(array));
    }

    @Test
    public void testSolve_threeElements1and2() {
        int[] array = {1, 10, 2};
        assertEquals(20, pp.solve(array));
    }

    @Test
    public void testSolve_twoLargeElements() {
        int[] array = {100_000, 100_000};
        assertEquals(10_000_000_000L, pp.solve(array));
    }

    @Test
    public void testSolve_twoNumberWithZero() {
        int[] array = {0, 100_000};
        assertEquals(0, pp.solve(array));
    }

    @Test
    public void testSolve_performanceTest() {
        int[] array = new int[100000];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(Integer.MAX_VALUE);
        }

        long currentTime = System.currentTimeMillis();
        pp.solve(array);
        System.out.println(System.currentTimeMillis() - currentTime);
    }
 */
}