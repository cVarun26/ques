package BinarySearch;

public class ShipPackages {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(capacity(arr,5));

    }

    public static int capacity(int[]arr,int days){

        int low=maxEl(arr),high=sum(arr);

        while(low<=high){
            int mid=(low+high)/2;

            if(noOfDays(arr,mid)<=days){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }

    private static int noOfDays(int[] weight, int capacity) {

        int days=0,load=0;
        for (int i = 0; i <weight.length ; i++) {
            if(load+weight[i]>capacity){
                days=days+1;
            }
            else load+=weight[i];

        }
        return days;
    }

    private static int maxEl(int[] arr) {

        int maxi=Integer.MIN_VALUE;
        for (int j = 0; j < arr.length ; j++) {
            maxi=Math.max(maxi,arr[j]);
        }
        return maxi;

    }

    public static int sum(int[]arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}

