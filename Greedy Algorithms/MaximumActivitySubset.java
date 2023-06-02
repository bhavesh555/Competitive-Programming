import java.util.*;


class rangeValue{
    int start;
    int end;
    rangeValue(int start, int end){
        this.start = start;
        this.end = end;
    }
}

public class MaximumActivitySubset{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        rangeValue[] arr=new rangeValue[n];
        for(int i=0; i<n; i++){
            arr[i]=new rangeValue(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr, new Comparator<rangeValue>(){
            public int compare(rangeValue a, rangeValue b){
                return a.end-b.end;
            }
        });
        int count=1;
        int end=arr[0].end;
        for(int i=1; i<n; i++){
            if(arr[i].start>=end){
                count++;
                end=arr[i].end;
            }
        }
        System.out.println(count);
    }
}