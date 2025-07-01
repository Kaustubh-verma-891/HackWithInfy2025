import java.util.*;
public class ActivitySelectionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] activityArray = new int[n][2];
        for (int i = 0 ; i < n ; i++) {
            activityArray[i][0] = sc.nextInt();
            activityArray[i][1] = sc.nextInt();
        }
        int maxNonOverlap = findLongestChain(activityArray);
        System.out.println(maxNonOverlap);
    }
    public static int findLongestChain(int[][] ActivityArray) {
        int n = ActivityArray.length;
        Arrays.sort(ActivityArray,(a,b) -> Integer.compare(a[1],b[1]));
        int count = 0;
        int end = Integer.MIN_VALUE;
        for (int[] activity : ActivityArray) {
            if (activity[0] >= end) {
                count++;
                end = activity[1];

            }
        }
        return count;
    }
}
