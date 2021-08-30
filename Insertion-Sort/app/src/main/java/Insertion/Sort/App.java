/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Insertion.Sort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
      int[] sample=  {2,3,5,7,13,11};
//      selectsort(sample);
        System.out.println(Arrays.toString(InsertionSort(sample)));
//        System.out.println(InsertionSort(sample));
//        InsertionSort(sample);
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
}
