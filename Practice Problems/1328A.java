//https://codeforces.com/problemset/problem/1328/A

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long div = 0, pls = 0;

            if (a % b == 0) {
                System.out.println(0);
                continue;
            }

            div = a / b;
            pls = (div + 1) * b;
            System.out.println(pls - a);
        }

        sc.close();
    }
}
