//https://codeforces.com/problemset/problem/231/A


import java.util.Scanner;
public class Team 
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int x=ip.nextInt();
        int ctr=0,s=0;
        int[] a = new int[3];
        int[] b = new int[1001];
        for(int i=1;i<=x;i++)
        {
            for(int j=0;j<=2;j++)
            {
                a[j]=ip.nextInt();
                s=a[0]+a[1]+a[2];
            }
            b[i]=s;
                if(b[i]>=2)
                    ctr++;
        }
        System.out.println(ctr);
    }
}
