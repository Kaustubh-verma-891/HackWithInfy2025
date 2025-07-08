import java.util.*;

public class GCD_Composition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            arr.add(sc.nextInt());
        }
        String ans = "No";
        if (n > 3) {
            HashSet<Integer> set = new HashSet<>();
           ans = gcdComposition(set);
        }
        System.out.println(ans);
    }
    public static String gcdComposition(HashSet<Integer> set) {
        ArrayList<Integer> list = new ArrayList<>(set);
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0 ; i < list.size() ; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0 ; i < list.size() - 1 ; i++) {
            for (int j = i + 1 ; j < list.size(); j++) {
                if (gcd(list.get(i),list.get(j)) == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        return isBipartite(graph) ? "yes" : "no";
    }

    public static boolean isBipartite(ArrayList<ArrayList<Integer>> graph) {
        int[] inorder = new int[graph.size()];
        Queue<Integer> pq = new LinkedList<>();
        pq.add(0);
        for (int i = 0 ; i < inorder.length ; i++) {
            if (inorder[i] == 0) {
                inorder[i] = 1;
                pq.add(i);
                while (!pq.isEmpty()){
                    int v = pq.poll();
                    for (int nbr : graph.get(v)) {
                        if (inorder[nbr] == 0) {
                            inorder[nbr] = 3 - inorder[nbr];
                            pq.add(nbr);
                        } else if (inorder[nbr] == inorder[v]) return false;
                    }
                }
            }
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (a%b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }
}
