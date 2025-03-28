package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[]arr={23,43,55,22,5,11};

        selectionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));;

    }
    public static void selectionSort(int[]arr,int n){
        for (int i = 0; i <=n-2 ; i++) {

            int mini=i;

            for (int j =i; j <=n-1 ; j++) {

                if(arr[j]<arr[mini])mini=j;

            }

            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;



        }
    }
}
