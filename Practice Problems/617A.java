//https://codeforces.com/problemset/problem/617/A

import java.util.*;

public class Solution {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int cnt=0;
		if(x<=5) System.out.println(1);
        
        else {
            while(x>5){
            x=x-5;
            cnt++;
        }
        	System.out.println(cnt+1);
        }
	
	}
}
