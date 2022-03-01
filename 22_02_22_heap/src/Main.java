import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HeapService heap = new HeapService();
        int[] array = {3, 8, 11, 1, 5, 6, 10, 4, 2, 9, 7, 12};
        //heap.makeHeap(array);
        //System.out.println(Arrays.toString(array));
        heap.heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
