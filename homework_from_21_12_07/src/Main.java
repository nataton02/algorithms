public class Main {

    public static void main(String[] args) {
	    // 1. Найти последнюю цифру числа фибоначи под номером до 2^31-1
        // 2. Найти остаток от деления числа фибоначи под номером до 2^31-1 на положительное число m

        System.out.println(getFibonacciLastDigit(10));
        System.out.println(getRemainderOfDividing(10, 3));

    }

    private static int getFibonacciLastDigit(int n) {
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        int temp;

        for (int i = 1; i < n; i++) {
            temp = (first + second) % 10;
            first = second;
            second = temp;
        }
        return second;
    }


    public static int getRemainderOfDividing(int n, int m) {
        if (m < 1)
            throw new IllegalArgumentException();
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        int temp;

        for (int i = 1; i < n; i++) {
            temp = (first + second) % m;
            first = second;
            second = temp;
        }
        return second;
    }

}
