//https://codeforces.com/problemset/problem/702/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int count = 1;
        int max = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1])
                count++;
            else {
                if (count > max)
                    max = count;
                count = 1;
            }
        }

        if (count > max)
            max = count;

        System.out.println(max);
    }
}
