package BinarySearch;

public class LowerBoundUpperBound {

    public static void main(String[] args) {

        int[]arr={1,2,4,5,12,34,45};
        int ans=upperBound(arr,5,arr.length);
        System.out.println(ans);
    }

    public static int lowerBound(int[]arr,int target,int n){

        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]>=target){
               ans=mid;
               high=mid-1;

           }
           else low=mid+1;
        }
        return ans;
    }

    public static int upperBound(int[]arr,int target,int n){
        int low=0;
        int high=n-1;
        int ans=n;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else low =mid+1;
        }
        return ans;
    }
}
