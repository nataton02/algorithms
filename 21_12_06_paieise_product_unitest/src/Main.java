public class Main {

    public static void main(String[] args) {
	// Есть ряд (массив) неотрицательных чисел. Необходимо найти маскимальное произведение двух их масиива.
        PairwiseProblem pairwiseProblem = new PairwiseProblem();

        //Сделаем на каждый случай по одному юниттнесту

//        System.out.println(pairwiseProblem.solve(new int[]{1, 2}));//2
//        System.out.println(pairwiseProblem.solve(new int[]{1, 10, 2}));//20
//        System.out.println(pairwiseProblem.solve(new int[]{100_000, 100_000}));// 1000.000.000
//        System.out.println(pairwiseProblem.solve(new int[]{0, 100_000})); // 0

        System.out.println(pairwiseProblem.solve2(new int[]{})); // 0
        System.out.println(pairwiseProblem.solve2(new int[]{10})); // 0
        System.out.println(pairwiseProblem.solve2(new int[]{5, 10}));// 50
        System.out.println(pairwiseProblem.solve2(new int[]{-10, 5}));// 0
        System.out.println(pairwiseProblem.solve2(new int[]{-10, -5}));// 0
        System.out.println(pairwiseProblem.solve2(new int[]{100, 0})); // 0
        System.out.println(pairwiseProblem.solve2(new int[]{5, 10, 20, 4}));// 200
        System.out.println(pairwiseProblem.solve2(new int[]{100_000, 100_000}));// 1000.000.000

    }
}
