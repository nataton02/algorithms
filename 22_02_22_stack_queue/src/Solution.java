import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public static void main(String[] args) {
        Deque<Integer> numbers = new ArrayDeque<>();

        char[] brackets = {'{', '}', '(', '[', ']', ')'};
        //System.out.println(areBracketsCorrect(brackets));

        String str5 = "({})";
        String str6 = "([)]";
        String str7 = "()[";
        String str8 = "[{()]}]";


    }

    /**
     * Метод принимает массив, состоящий из трех видов скобок (6 различных символов): (), {}, []. Необходимо
     * определить, является ли порядок скобок в массиве корректным.
     * <p>
     * {}([]) - корректный порядок
     * {}([]{()}) - корректный порядок
     * {(] - некорректный порядок
     * {}([])} - некорректный порядок
     * {}([])( - некорректный порядок
     * {(}) - некорректный порядок
     *
     * @param brackets
     * @return
     */
    public boolean areBracketsCorrect (char[] brackets) {
        Deque<Character> chars = new ArrayDeque<>();
        for (int i = 0; i < brackets.length; i++) {
            if(brackets[i] == '{' || brackets[i] == '[' || brackets[i] == '(')
                chars.addFirst(brackets[i]);
            if(chars.size() == 0)
                return false;
            else if(brackets[i] == '}' && chars.getFirst() == '{')
                chars.removeFirst();
            else if(brackets[i] == ']' && chars.getFirst() == '[')
                chars.removeFirst();
            else if(brackets[i] == ')' && chars.getFirst() == '(')
                chars.removeFirst();
            else
                return false;
        }
        return true;
    }

    //В ресторан периодически попадает заказ. У заказа есть время, когда он был сделан
    // (milliseconds from 1970 1 Jan, UTC). Для каждого заказа необходимо установить количество заказов,
    // сделанных за 15 (20, N) минут до него.

    /**
     *
     * @param orderTimes - массив отсортированных по времени моментов, когда происходили заказы.
     * @param minutes
     * @return количество заказов, сделанных в предыдущие minutes минут.
     */
    /*public int[] countOrdersNumber (long[] orderTimes, int minutes) {

    }*/
}
