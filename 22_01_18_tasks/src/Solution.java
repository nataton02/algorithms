import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    /**
     * The method must return true if there are 2 numbers from the numbers array, whose multiplication is the product
     * {2, 5, 18, 50}, 36 -> true
     * {2, 5, 18, 50}, 36 -> false
     * @param numbers array of sorted numbers
     * @param product some number
     * @return
     */
    // Эффективно (О(n)) задача может быть решена с помощью ArrayDeque
    public boolean containsProduct(int[] numbers, int product) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        int first = numbers[0];
        arrayDeque.addFirst(first);

        for (int i = numbers.length - 1; i > 0; i--) {
            arrayDeque.addLast(numbers[i]);
            if(first * arrayDeque.getLast() > product)
                arrayDeque.removeLast();
            if(first * arrayDeque.getLast() == product)
                return true;
        }
        return false;
    }



    // str - состоит только из маленьких букв.
    // "aaaabccccd" -> "4a2b4cd"
    public String encode(String str) {
        String res = "";
        char current = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++ ) {
            if(str.charAt(i) == current) {
                count++;
            } else {
                if (count == 1) {
                    res += Character.toString(current);
                } else {
                    res += count + Character.toString(current);
                }
                current = str.charAt(i);
                count = 1;
            }

            // last element
            if (i == str.length() - 1) {
                if (count == 1) {
                    res += Character.toString(current);
                } else {
                    res += count + Character.toString(current);
                }
                return res;
            }
        }
        return  res;
    }

    // str - состоит только из маленьких букв.
    // "4a2b4cd" -> "aaaabbccccd"
    //public String decode(String str) {

    //}
}
