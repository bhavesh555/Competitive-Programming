package Greedy_Algorithms;


import java.util.*;

class timing{
    int start;
    int finish;
    int profit;
    timing(int start, int finish, int profit){
        this.start=start;
        this.finish=finish;
        this.profit=profit;
    }
}
public class WeightedJobs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        timing[] arr=new timing[n];
        for(int i=0; i<n; i++){
            arr[i]=new timing(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr, new Comparator<timing>(){
            public int compare(timing a, timing b){
                return a.finish-b.finish;
            }
        });
        int[] dp=new int[n];
        dp[0]=arr[0].profit;
        for(int i=1; i<n; i++){
            int including=arr[i].profit;
            int nonConflicting=-1;
            for(int j=i-1; j>=0; j--){
                if(arr[j].finish<=arr[i].start){
                    nonConflicting=j;
                    break;
                }
            }
            if(nonConflicting!=-1){
                including+=dp[nonConflicting];
            }
            dp[i]=Math.max(including, dp[i-1]); 
        
        }
        System.out.println(dp[n-1]);

    }
}
