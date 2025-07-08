import java.util.Scanner;

public class nFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if (n == 0) return 0;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2 ; i <= n ; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
