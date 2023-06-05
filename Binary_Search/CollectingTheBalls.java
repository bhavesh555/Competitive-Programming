import java.util.Scanner;

public class Solution {
    
    static long helper(long start, long end, long N, long[] ans) {
        if (start > end) {
            return ans[0];
        }
        
        long n = N;
        
        long mid = (start + end) / 2;
        long k = mid;
        
        long sharma = 0, singh = 0;
        
        while (n >= k && n > 0) {
            sharma += k;
            n = n - k;
            singh += (n) / 10;
            n = n - (n) / 10;
        }
        
        sharma += n;
        
        if (2 * sharma < N) {
            return helper(mid + 1, end, N, ans);
        } else {
            ans[0] = k;
            return helper(start, mid - 1, N, ans);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int t=scanner.nextInt();
	   while(t-->0){
		    long n = scanner.nextLong();
        
        long[] ans = new long[1];
        System.out.println(helper(1, n, n, ans));
	   }
    }
}
