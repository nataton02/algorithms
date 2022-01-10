import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    public void test_Solve_sum23() {
        int res = Task2.exchangeMoney(23);
        assertEquals(5, res);
    }

    @Test
    public void test_Solve_sum17() {
        int res = Task2.exchangeMoney(17);
        assertEquals(4, res);
    }

    @Test
    public void test_Solve_sum101() {
        int res = Task2.exchangeMoney(101);
        assertEquals(11, res);
    }
}