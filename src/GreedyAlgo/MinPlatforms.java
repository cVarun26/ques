package GreedyAlgo;

import java.util.Arrays;
import java.util.Collections;

public class MinPlatforms {
    public static void main(String[] args) {

        int[] arr ={900,945,955,1100,1500,1800};
        int[] dep={920,1200,1130,1150,1900,2000};
        System.out.println(optimalBrute(arr,dep));
    }

    public static int minBrute(int[]arr, int[]dep){
        int ans=1;
        for (int i = 0; i <arr.length-1 ; i++) {
            int count=1;
            for (int j = i+1; j <arr.length-1 ; j++) {
                if((arr[i]>=arr[j]&& arr[i]<=dep[j] || (arr[j]>=arr[i] && arr[j]<=dep[i]))){
                    count++;
                }
            }
           ans= Math.max(ans,count);
        }
        return ans;
    }

    public static int optimalBrute(int[]arr, int[]dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0,j=0;
        int count=0,maxCount=0;

        while(i<arr.length){
            if(arr[i]<=dep[j]){
                count++;
                i++;
            }else{
                count--;
                j++;
            }
         maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}
