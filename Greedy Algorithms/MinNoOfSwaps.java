package Greedy_Algorithms;

import java.util.Scanner;

public class MinNoOfSwaps {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            s.nextLine();
            String s=sc.nextLine();
            ArrayList<Character> ch=new ArrayList<>();
            for(int i=0; i<n; i++){
                s.next().charAt(0);
                ch.add(s.charAt(i));
            }
            //Flag Array
            int[] flag=new int[n];
            for(int i=0; i<n; i++){
                flag[(int)(ch.get(i)-'a')]=1;
                }
                int[][] freq=new int[n][26];
                for(int i=0; i<n; i++){
                    int maxi=0;
                    int sum=0;
                    for(int j=0; j<26; j++){
                        sum+=freq[i][j];
                        if(freq[i][j]> maxi && flag[j]==1){
                            maxi=freq[i][j];
                        }
                    }
                    total+=sum-maxi;
                }
                System.out.println(total);
            }

        }   
}
