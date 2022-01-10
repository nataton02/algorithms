public class Task1 {
    /**
     * The method must return the min possible number of segment of the length l, so that all the numbers are
     * covered by these segments
     * @param numbers an array of sorted numbers
     * @param l  the length of the segments
     * @return
     */

    public static int getSegmentNumber(int[] numbers, int l) {
        int rightMarginSegment = numbers[0] + l;
        int segmentsNumber = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= rightMarginSegment) {
                continue;
            }
            rightMarginSegment = numbers[i] + l;
            segmentsNumber++;
        }
        return segmentsNumber;
    }
}
