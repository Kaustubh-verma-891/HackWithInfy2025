import java.util.Scanner;

public class climbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for (int i = 2 ; i <= n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
