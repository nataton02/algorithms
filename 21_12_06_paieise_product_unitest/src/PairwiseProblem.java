public class PairwiseProblem {

    /**
     * The methid must calculate the max pairwise product from the array with only non-negative numbers
     * @param array the array to find the product from
     * @return max pairwise product
     */

    //TODO implement this, finding two max numbers (the numbers must be on the different indicies)

    public long solve2(int[] array) {
        int maxNumber = 0;
        int secondMaxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                continue;
            }

            if(array[i] >= maxNumber) {
                secondMaxNumber = maxNumber;
                maxNumber = array[i];
            }
        }
        return (long) maxNumber * secondMaxNumber;
    }



    public long solve(int[] array) {
        long result = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                long multiplication = (long) array[i] * array[j];
                if(multiplication > result)
                    result = multiplication;
            }
        }
        return result;
    }
}
