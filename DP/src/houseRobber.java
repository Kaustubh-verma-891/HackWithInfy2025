import java.util.Scanner;

public class houseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0 ; i < n ; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2 ; i < n ; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i]);
        }
        return dp[n-1];
    }
}
