import java.util.*;

public class Gift {
    public static void find_youngest_member(int n, int m, int[][] gifts) {
        // Write your logic here.
        int[]gives= new int[n+1];
        int[]receives= new int[n+1];
        for (int i = 0; i < m; i++) {
            int from = gifts[i][0];
            int to = gifts[i][1];
            gives[from]++;
            receives[to]++;
        }

        for (int i = 1; i <= n; i++) {
            if (gives[i] == 0 && receives[i] == n - 1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] gifts = new int[m][2];
        for (int i = 0; i < m; i++) {
            gifts[i][0] = scanner.nextInt();
            gifts[i][1] = scanner.nextInt();
        }
        find_youngest_member(n, m, gifts);
        scanner.close();
    }
    }

