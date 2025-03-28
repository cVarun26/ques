package BinarySearch;

import java.util.Map;

public class Bananas {
    public static void main(String[] args) {

        int[]arr={3,6,7,11};
        System.out.println(bananas(arr,8));

    }

    public static int bananas(int[]arr,int hourly){

        int low=1;
        int high=maxElement(arr);

        while(low<=high){
            int mid=(low+high)/2;
            int total=totalHours(arr,mid);
            if(total<=hourly){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }

    public static int totalHours(int[]arr,int hourly){

        int totalH=0;

        for (int i = 0; i <arr.length ; i++) {
            totalH+= Math.ceil((double)(arr[i])/(double) (hourly));

        }
        return totalH;
    }

    public static int maxElement(int[]arr){

        int maxi=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {

            maxi=Math.max(maxi,arr[i]);

            }
        return maxi;
    }
}
