//https://codeforces.com/contest/1842/problem/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList<Long> tsondu = new ArrayList<>();
            ArrayList<Long> tenzing = new ArrayList<>();

            long sum1 = 0, sum2 = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                tsondu.add(x);
                sum1 += x;
            }

            for (int i = 0; i < m; i++) {
                long y = sc.nextLong();
                tenzing.add(y);
                sum2 += y;
            }

            for (int i = 0; i < n; i++) {
                sum1 += tsondu.get(i);
            }

            for (int i = 0; i < m; i++) {
                sum2 += tenzing.get(i);
            }

            switch (Long.compare(sum1, sum2)) {
                case 0:
                    System.out.println("Draw");
                    break;
                case 1:
                    System.out.println("Tsondu");
                    break;
                case -1:
                    System.out.println("Tenzing");
                    break;
            }
        }
    }
}
