package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={1,2,3,566,32,34};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[]arr,int n){
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
    }

}
