package Two_Pointers;
import java.util.*;
public class PrependAndAppend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();

            int i=0;
            int j=n-1;
            int count=0;
            int ans=0;
            while(i<j){
                if(s.charAt(i)=='1' && s.charAt(j)=='0'){
                    count=count+2;
                    i++;
                    j--;
                }
                else if(s.charAt(i)=='0' && s.charAt(j)=='1'){
                    count=count+2;
                    i++;
                    j--;
                }else{
                    break;
                }
                 
                
            }
            ans=s.length()-count;
            System.out.println(ans);
        }
        }
    }
