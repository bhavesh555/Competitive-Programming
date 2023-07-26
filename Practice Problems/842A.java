//https://codeforces.com/problemset/problem/842/A


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long l, r, x, y, k;
        l = scanner.nextLong();
        r = scanner.nextLong();
        x = scanner.nextLong();
        y = scanner.nextLong();
        k = scanner.nextLong();

        for (long i = x; i <= y; i++) {
            long j = i * k;
            if (j >= l && j <= r) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
