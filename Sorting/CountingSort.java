package Sorting;

import java.io.*;
import java.util.*;
class CodingNinja {
public static int miniArray(int[] arr){
int n = arr.length;
int mini = arr[0];
for(int i=1;i<n;i++) mini = Math.min(mini,arr[i]);
return mini;
}
public static int maxiArray(int[] arr){
int n = arr.length;
int maxi = arr[0];
for(int i=1;i<n;i++) maxi = Math.max(maxi,arr[i]);
return maxi;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++) arr[i] = sc.nextInt();
int mini = miniArray(arr);
int maxi = maxiArray(arr);
// initialize an array with the number of elements equals to
// difference between maximum and minimum number
int[] f = new int[maxi-mini+2];
// update the frequency of each number shifted by the minimum number
// this will make the minimum number always shift to zero
for(int i=0;i<n;i++) f[arr[i]-mini]++;
// print the sorted array & before printing shift the number to its
// original form
for(int i=0;i<f.length;i++){
for(int j=0;j<f[i];j++){
System.out.print((i+mini)+" "); }
}
}
}