//https://codeforces.com/problemset/problem/71/A

import java.util.*;

public class solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        
        while(t-->0){
            StringBuilder str=new StringBuilder();
            String s=sc.next();
            if(s.length()<=10) System.out.println(s);
            else{
                str.append(s.charAt(0));
                str.append(Integer.toString(s.length()-2));
                str.append(s.charAt(s.length()-1));
            }
            String ans=str.toString();
            System.out.println(ans);
        }
    }
} 
