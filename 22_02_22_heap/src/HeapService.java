import java.util.Arrays;

public class HeapService {
    /**
     * Делает массив таким образом, что он становится кучей (каждый родитель больше 2 своих потомков)
     * @param array
     */
    // Если у узла в куче индекс в массиве равняется i, то индекс его детей равняется: 2*i + 1; 2*i + 2
    public void makeHeap (int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            shiftDown(i, array);
        }
    }

    /**
     * Сдвигает элемент с индексом i по куче таким образом, что он встает на свое место (родитель больше него,
     * а оба дочерних элемента меньше)
     * @param i
     * @param array
     */
    private void shiftDown(int i, int[] array) {

        int max = i;
        int child1 = 2 * i + 1;
        int child2 = 2 * i + 2;

        if (child1 < array.length && array[child1] > array[max])
            max = child1;

        if (child2 < array.length && array[child2] > array[max])
            max = child2;

        if (max != i) {
            int swap = array[i];
            array[i] = array[max];
            array[max] = swap;
            shiftDown(max, array);
        }
    }

    //TODO complete. После того, как массив преобрел структуру кучи, необходимо вытаскивать из кучи
    // самый верхнмй элемент, затем ставить на его место самый последний элемент и сдвинуть его вниз
    // на свое место (siftDown)

    public void heapSort(int[] array)  {
        int[] sorted = new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            sorted[i] = array[0];
            array[0] = array[array.length - i - 1];
            shiftDown(0, array);
        }

        System.arraycopy(sorted, 0, array, 0, sorted.length);

    }
}
