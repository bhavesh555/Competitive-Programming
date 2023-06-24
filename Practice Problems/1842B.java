//https://codeforces.com/contest/1842/problem/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            ArrayList<Long> a = new ArrayList<>();
            ArrayList<Long> b = new ArrayList<>();
            ArrayList<Long> c = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a.add(sc.nextLong());
            }
            for (int i = 0; i < n; i++) {
                b.add(sc.nextLong());
            }
            for (int i = 0; i < n; i++) {
                c.add(sc.nextLong());
            }

            boolean res = check(a, b, c, x, n);
            System.out.println(res ? "YES" : "NO");
        }
    }

    public static boolean check(ArrayList<Long> a, ArrayList<Long> b, ArrayList<Long> c, long x, int n) {
        
        long ans = 0;

        for (int i = 0; i < n; i++) {
            if ((a.get(i) & x) == a.get(i))
                ans |= a.get(i);
            else{
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if ((b.get(i) & x) == b.get(i))
                ans |= b.get(i);
            else{
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if ((c.get(i) & x) == c.get(i))
                ans |= c.get(i);
            else{
                break;
            }
        }

        return ans == x;
    }
}
