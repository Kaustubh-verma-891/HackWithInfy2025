import java.util.HashSet;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] dishes = new int[n];
            for (int i = 0; i < n; i++) {
                dishes[i] = sc.nextInt();
            }
            int answer = minServing(dishes);
            System.out.println(answer);
        }
    }
    public static int minServing(int[] dishes) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : dishes) set.add(i);
        int[] ans = {-1,-1};
        set.forEach(i -> {
            int pre = 0;
            int cur = (dishes[0] == i ? 1 : 0);
            for (int j = 1 ; j < dishes.length ; j++) {
                int temp = cur;
                cur = Math.max(cur,pre + (dishes[j] == i ? 1 : 0));
                pre = temp;
            }
            if (ans[0] == -1) {
                ans[0] = i;
                ans[1] = cur;
            } else {
                if (ans[1] < cur) {
                    ans[1] = cur;
                    ans[0] = i;
                } else if (ans[1] == cur) {
                    ans[0] = Math.min(ans[0],i);
                }
            }
        });
        return ans[0];
    }
}
