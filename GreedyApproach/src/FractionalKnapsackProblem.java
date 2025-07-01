import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsackProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] boxTypes = new int[n][2];
        for (int i = 0 ; i < n ; i++) {
            boxTypes[i][0] = sc.nextInt();
            boxTypes[i][1] = sc.nextInt();
        }
        int truckSize = sc.nextInt();
        int maxUnits = maximumUnits(boxTypes, truckSize);
        System.out.println(maxUnits);
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int n = boxTypes.length;
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1],a[1]));
        int totalUnits = 0;
        for (int i = 0 ; i < n && truckSize > 0 ; i++) {
            int[] box = boxTypes[i];
            int units = Math.min(box[0],truckSize);
            totalUnits += units * box[1];
            truckSize -= units;
        }
        return totalUnits;
    }
}
