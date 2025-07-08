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
        System.out.println(minCoins);
    }
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int[] arr : dp) {
            Arrays.fill(arr,-1);
        }
        return recursion(coins,0,amount,dp);
    }
    public static int recursion(int[] coins, int i, int amount, int[][] dp) {
        if (amount == 0) return 0;
        if (i >= coins.length) return 1000000;
        if (amount < 0) return 1000000;
        if (dp[i][amount] != -1) return dp[i][amount];
        int pick = 1 + recursion(coins,i,amount-coins[i],dp);
        int notPick = recursion(coins,i+1,amount,dp);
        return dp[i][amount] = Math.min(pick,notPick);
    }
}
