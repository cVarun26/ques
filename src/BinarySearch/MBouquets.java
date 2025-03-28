package BinarySearch;

public class MBouquets {
    public static void main(String[] args) {

        int[]arr={7,7,7,7,13,11,12,7};
        int m=2,k=3;
        System.out.println(mBouquets(arr,m,k));

    }

    public static int mBouquets(int[]arr, int m, int k){
        if(m*k> arr.length) return -1;

        int low=mini(arr);
        int high=maxi(arr);

        while(low<=high){
            int mid=(low+high)/2;

            if(possible(arr,mid,m,k)){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }

    public static boolean possible(int[]arr, int day,int m, int k){

        int count=0,noOfBouquets=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=day)count++;
            else{
                noOfBouquets+=(count/k);
                count=0;
            }
        }
        noOfBouquets+=(count/k);
        return noOfBouquets>=m;
    }

    public static int mini(int[]arr){
        int minimum=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            minimum=Math.min(minimum,arr[i]);

        }
        return minimum;
    }
    public static int maxi(int[]arr){
        int maximum=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            maximum=Math.max(maximum,arr[i]);

        }
        return maximum;
    }
}
