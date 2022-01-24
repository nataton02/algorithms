public class Solution {
    /**
     * The method sort the array via merge sort approach
     *
     * @param numbers
     */
    public void mergeSort(int[] numbers) {
        mergeSortRecursively(numbers, 0, numbers.length);
    }

    /**
     * The function recursively sorts the array from left index inclusively to right index exclusively
     *
     * @param numbers
     * @param leftIndex
     * @param rightIndex
     */
    private void mergeSortRecursively(int[] numbers, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex == 1)
            return;

        int middleIndex = (rightIndex + leftIndex) / 2;

        mergeSortRecursively(numbers, leftIndex, middleIndex);
        mergeSortRecursively(numbers, middleIndex, rightIndex);

        merge(numbers, leftIndex, rightIndex, middleIndex);
    }

    // далее производим слияние отсортированных кусков
    // массива numbers (от leftIndex до middleIndex и от middleIndex до rightIndex) во вспомогательный
    // массив tempArray. Тем самым мы получаем, что TempArray это отсортированный  массив длины
    // rightIndex - leftIndex, который надо скопировать в массив numbers между leftIndex и rightIndex.
    //TODO implement merge into tempArray

    private void merge(int[] numbers, int leftIndex, int rightIndex, int middleIndex) {
        int[] tempArray = new int[rightIndex - leftIndex];

        int i = leftIndex;
        int j = middleIndex;

        int k = 0;

        while (i < middleIndex && j < rightIndex) {
            if (numbers[i] < numbers[j]) {
                tempArray[k] = numbers[i];
                i++;
            } else {
                tempArray[k] = numbers[j];
                j++;
            }
            k++;
        }

        if (i == middleIndex) {
            System.arraycopy(numbers, j, tempArray, k, rightIndex - j);
        } else if (j == rightIndex) {
            System.arraycopy(numbers, i, tempArray, k, middleIndex - i);
        }
        System.arraycopy(tempArray, 0, numbers, leftIndex, tempArray.length);
    }





    //TODO
    // Есть массив с положительными int. Необходимо найти элемент (если он есть), который встречается в
    // массиве > length/2 (доменантный). В противном случае вернуть -1.
    // Подсказка: если такой элемент есть, значит, что в одной из половин массива этот элемент также
    // встречается не меньше, чем размер пдмассива пополам. {2, 1, 2, 3, 2}

    public int findDominant(int[] numbers) {
        return findDominantRecursively(numbers, 0, numbers.length);
    }

    private int findDominantRecursively(int[] numbers, int leftIndex, int rightIndex) {
        if(rightIndex - leftIndex == 1)
            return numbers[leftIndex];

        int middleIndex = (leftIndex + rightIndex) / 2;
        int leftDominant = findDominantRecursively(numbers, leftIndex, middleIndex);
        int rightDominant = findDominantRecursively(numbers, middleIndex, rightIndex);

        if(leftDominant >= 0) {
            if(checkDominant(numbers, leftIndex, rightIndex, leftDominant))
                return leftDominant;
        } else if(rightDominant >= 0) {
            if(checkDominant(numbers, leftIndex, rightIndex, rightDominant))
                return rightDominant;
        }
        return -1;
    }

    private boolean checkDominant(int[] numbers, int leftIndex, int rightIndex, int dominant) {
        int counter = 0;
        for (int i = leftIndex; i < rightIndex; i++) {
            if(numbers[i] == dominant)
                counter++;
        }
        return counter > (rightIndex - leftIndex) / 2;
    }

    /**
     * Логорифмом от n с основанием m называется степень, в которую надо возвести m, чтобы получить n.
     * Пример: log_2(1024) = 10.
     *
     * В алгоритме Binary Search количество шагов примерно равно log_2(n), где n - это количество элементов в массиве.
     *
     * O(f(n)) = O(C * f(n))
     *
     * O(n3) = O(C * n3) - пример
     *
     * Почему сложность называется логарифмической, не указывая фактически основания логарифмической функции в
     * терминах О большого? Потому что любаф логарифмическая функция равна любой другой
     */
}
