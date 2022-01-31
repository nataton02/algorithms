import java.util.ArrayDeque;
import java.util.Collections;
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

    public boolean containsProductEff(int[] numbers, int product) {
        int i = 0;
        int j = numbers.length - 1;

        while(j - i > 0) {
            int mul = numbers[i] * numbers[j];

            if(mul < product)
                i++;
            else if(mul >product)
                j --;
            else
                return true;
        }
        return false;
    }


    //2.  str - состоит только из маленьких букв.
    // "aaaabccccd" -> "4a2b4cd"
    public String encode(String str) {
        if (str.length() == 0)
            return "";

        int count = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                if (count > 1) {
                    builder.append(count).append(str.charAt(i - 1));
                    count = 1;
                }
                else {
                    builder.append(str.charAt(i - 1));
                }
            } else
                count++;
        }
        if(count == 1)
            builder.append(str.charAt(str.length() - 1));
        else
            builder.append(count).append(str.charAt(str.length() - 1));
        return builder.toString();
    }

    //3.  str - состоит только из маленьких букв.
    // "4a2b4cd" -> "aaaabbccccd"
    //public String decode(String str) {

    public String decode(String str) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int digitsNum = 0;
            while (Character.isDigit(str.charAt(i + digitsNum))) {
                digitsNum++;
            }

            if(digitsNum > 0) {
                int charNum = Integer.parseInt(str.substring(i, i + digitsNum));
                i += digitsNum;

                for (int j = 0; j < charNum; j++) {
                    builder.append(str.charAt(i));
                }
            }
            else {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}
