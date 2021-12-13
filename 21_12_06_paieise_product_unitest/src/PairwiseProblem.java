public class PairwiseProblem {

    /**
     * The methid must calculate the max pairwise product from the array with only non-negative numbers
     * @param array the array to find the product from. The array must be of length > 1
     * @return max pairwise product
     * @throws IllegalArgumentException if the length of the array is lower than 2
     */

    //TODO implement this, finding two max numbers (the numbers must be on the different indicies)

    public long solve2(int[] array) {
        if(array.length < 2)                         // C0* 1 операций
            throw new IllegalArgumentException();
        // find the index of the max element
        int maxNumberIndex = 0;

        for (int i = 1; i < array.length; i++) { // Количество операций  C1 * n
            if(array[i] > array[maxNumberIndex])
                maxNumberIndex = i;
        }

        int maxNumber = array[maxNumberIndex];   // C2 операций
        array[maxNumberIndex] = array[0];
        array[0] = maxNumber;

        int prevMaxNumberIndex = 1;                // С3*n операций
        for (int i = 2; i < array.length; i++) {
            if (array[i] > array[prevMaxNumberIndex])
                prevMaxNumberIndex = i;
        }

        return (long) maxNumber * array[prevMaxNumberIndex];   // C0 + C2 + (C1 + C3)операций = a + b*n = O(n)
    }



    public long solve(int[] array) {
        long result = 0;

        for (int i = 0; i < array.length; i++) {                 // (n-1) + (n-2) + (n-3) + ... + 1 -
            for (int j = i + 1; j < array.length; j++) {        // кол-во раз, что мы попадаем на блок кода м/у 43-45
                long multiplication = (long) array[i] * array[j];// строками. Кол-во операций на строках 43-45 пусть
                if(multiplication > result)                      //будет С. Тогда всего кол-во операций в цикле:
                    result = multiplication;               // C * ((n-1) + (n-2) + ... + 1) = C * n * (n-1)/2 =
            }                                              // C/2 * n^2 - C/2 * n - является O(n^2)
        }
        return result;
    }
}
