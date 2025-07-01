import java.util.*;

public class MinimumCoinProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0 ; i < n ; i++) {
            coins[i] = sc.nextInt();
        }
        int amount = sc.nextInt();
        int minCoins = coinChange(coins,amount);
    }
    public static int coinChange(int[] coins, int amount) {
        return 0;
    }
}
