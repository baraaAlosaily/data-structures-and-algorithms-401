/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Insertion.Sort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
      int[] sample=  {8,4,23,42,16,15};
//      selectsort(sample);
        QuickSort(sample,0,sample.length-1);
        System.out.println(Arrays.toString(sample));
//        System.out.println(InsertionSort(sample));
//        InsertionSort(sample);
//        Mergesort(sample);
    }

    public static int[] selectsort(int[]arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
           int min=i;
            for (int j = i+1; j <n ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static int[] InsertionSort(int[]arr){

        for (int i = 1; i < arr.length; i++) {
            int j =i-1;
            int temp=arr[i];
            while (j>=0&&temp<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;

        }
        return arr;
    }
    public static void Mergesort(int[]arr){
        int n=arr.length;

        if (n>1){
            int mid=n/2;
            int[] left=Arrays.copyOfRange(arr,0,mid);
            int[] right=Arrays.copyOfRange(arr,mid,n);

            Mergesort(left);
            Mergesort(right);
            Merge(left,right,arr);
        }
    }
    public static void Merge(int[] left, int[]right, int[]arr){
        int i=0;
        int j=0;
        int k=0;


        while (i<left.length&&j<right.length){
            if (left[i]<=right[j]){
                arr[k]=left[i];
                i=i+1;
            }else {
                arr[k]=right[j];
                j=j+1;
            }
            k=k+1;
        }
        if (i==left.length){
            while (j< right.length){
                arr[k]=right[j];
                k=k+1;
                j=j+1;
            }
        }else {
            while (i<  left.length){
                arr[k]=left[i];
                k=k+1;
                i=i+1;
            }
        }
    }

    public static void QuickSort(int[] arr,int left,int right){
        if(left<right){
            int position=Partition(arr,left,right);
            QuickSort(arr,left,position-1);
            QuickSort(arr,position+1,right);
        }
    }
    public static int Partition(int[] arr, int left, int right){
        int pivot=arr[right];
        int low=left-1;

        for (int i = left; i < right; i++) {
            if(arr[i]<=pivot){
                low++;
                swap(arr,i,low);
            }
        }
        swap(arr,right,low+1);
        return low+1;
    }

    public static void swap(int[] arr,int i,int low){
        int temp;
        temp=arr[i];
        arr[i]=arr[low];
        arr[low]=temp;
    }
}
