package Sorting;

import java.io.*;
import java.util.*;

public class MergeSort {
public static int mergeAndCount(int[] arr , int l , int mid , int r){
// size of 2 subarrays to be merged
int n1 = mid-l+1;
int n2 = r-mid;
int L[] = Arrays.copyOfRange(arr,l,mid+1);
int R[] = Arrays.copyOfRange(arr,mid+1,r+1);
int i=0,j=0,k=l,swaps=0;
while(i<n1 && j<n2){
if(L[i]<=R[j]){
arr[k]=L[i];
k++;
i++;
}
else{
arr[k]=R[j];
swaps+=n1-i;
k++;
j++;
}
}
// copying the remaining elements of the L[] if any:
while(i<n1){
arr[k] = L[i];
i++;
k++;
}
// copying the remaining elements of the R[] if any:
while(j<n2){
arr[k] = R[j];
j++;
k++;
}
return swaps;
}
// merge sort function & Counting Inversions
public static int mergeSortAndCount(int[] arr, int l, int r){
int total=0;
if(l<r){
int mid = l+(r-l)/2;
total+=mergeSortAndCount(arr,l,mid);
total+=mergeSortAndCount(arr,mid+1,r);
total+=mergeAndCount(arr,l,mid,r);
}
return total;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++) arr[i] = sc.nextInt();
int ans = mergeSortAndCount(arr,0,n-1);
System.out.print(ans);
}
}