package BinarySearch;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] arr={1,2,5,9};
        System.out.println(smallestD(arr,6));

    }

    public static int smallestD(int[]arr, int threshold){

        if(arr.length>threshold) return -1;
        int low=1,high=maxEl(arr);

        while (low <= high) {

            int mid=(low+high)/2;

            if(sumOfD(arr,mid)<=threshold){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }

    private static int sumOfD(int[] arr, int div) {
        int sum=0;

        for (int i = 0; i <arr.length; i++) {
            sum+=Math.ceil((double)(arr[i]/(double)(div)));
            }
        return sum;

    }

    private static int maxEl(int[] arr) {
        int sum=0;

            int maxi=Integer.MIN_VALUE;
            for (int j = 0; j < arr.length ; j++) {
                maxi=Math.max(maxi,arr[j]);
                }
            return maxi;

        }
    }

