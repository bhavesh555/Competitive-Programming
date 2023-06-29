//https://codeforces.com/contest/967/problem/B

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final int MX = 999999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, A, B, cnt = 0, total = 0;
        n = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();

        int[] siz = new int[100005];
        for (int i = 0; i < n; i++) {
            siz[i] = scanner.nextInt();
            total += siz[i];
        }

        int first = siz[0];

        Arrays.sort(siz, 1, n);

        for (int i = n - 1; i > 0; i--) {
            if (first * A / total >= B)
                break;

            total -= siz[i];
            cnt++;
        }

        System.out.println(cnt);
    }
}
