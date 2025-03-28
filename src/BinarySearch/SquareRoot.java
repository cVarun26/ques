package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }

    public static int sqrt(int n){

        int low=1;
        int high=n;

        while(low<=high){
            int mid=(low+high)/2;
            int ans=1;

            if(mid*mid<=n){
                ans=mid;
                low=mid+1;

            }
            else high=mid-1;
        }
        return high;
    }
}
