package Sorting;
import java.util.*;


public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    public static void merge(int[] arr, int l, int mid, int r){
        int[] temp=new int[r-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        for(int p=l; p<=r; p++){
            arr[p]=temp[p-l];
        }
    }
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
