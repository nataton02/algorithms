import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void areBracketsCorrect_test_true () {
        char[] brackets = {'{', '}', '(', '[', ']', ')'};
        char[] brackets2 = {'{', '}', '(', '[', ']', '{', '(', ')', '}', ')'};

        assertTrue(solution.areBracketsCorrect(brackets));
        assertTrue(solution.areBracketsCorrect(brackets2));
    }

    @Test
    public void areBracketsCorrect_test_false() {
        char[] brackets = {'{', '(', ']',};
        char[] brackets2 = {'{', '}', '(', '[', ']', ')', '}'};
        char[] brackets3 = {'{', '(', '}', ')'};

        assertFalse(solution.areBracketsCorrect(brackets));
        assertFalse(solution.areBracketsCorrect(brackets2));
        assertFalse(solution.areBracketsCorrect(brackets3));
    }
}