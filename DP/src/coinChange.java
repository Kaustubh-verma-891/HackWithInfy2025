import java.util.Arrays;
import java.util.Scanner;

public class coinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0 ; i < n ; i++) {
            coins[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(count(coins,sum));
    }
    public static int count(int[] coins, int sum) {
        int n = coins.length;
        Arrays.sort(coins);
        int[][] dp = new int[n+1][sum+1];
        for (int[] arr : dp) {
            Arrays.fill(arr,-1);
        }
        return helper(coins,0,sum,dp);
    }
    public static int helper(int[] coins, int i, int sum, int[][] dp) {
        if (i == coins.length || sum < 0) return 0;
        if (sum == 0) return 1;
        if (dp[i][sum] != -1) return dp[i][sum];
        int pick = helper(coins,i,sum-coins[i],dp);
        int nPick = helper(coins,i+1,sum,dp);
        return dp[i][sum] = pick+nPick;
    }
}
