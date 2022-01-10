public class Task2 {
    /**
     * Compose money from the coins 1, 5, 10 cent, so that the number of coins is min possible
     * @param money the amount of money to compose
     * @return the min possible number of coins, which compose the (amount) money
    */
    //23 = 10 + 10 + 1 + 1 + 1 = 5 coins

    public static int exchangeMoney(int money) {
        int num10cent = money / 10;
        int num5cent = (money % 10) / 5;
        int num1cent = (money % 5) / 1;
        return num10cent + num5cent + num1cent;
    }
}
