//https://codeforces.com/problemset/problem/37/A

import java.util.Scanner;
public class Towers
{
    public static void main(String args[])
    {
        Scanner z=new Scanner(System.in);
        int a=z.nextInt();
        int[] b=new int[a];
        for(int i=0;i<b.length;i++)
            b[i]=z.nextInt();
        int k1=0,y=0;
        for(int i=0;i<b.length;i++)
        {
            int k=0;
            for(int j=i;j<b.length;j++)
            {
                if(b[i]==b[j])
                    k++;
            }
            if(k==1)
                k1++;
            y=Math.max(y, k);
        }
        System.out.println(y+" "+k1);
    }
}
