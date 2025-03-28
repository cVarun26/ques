package BinarySearch;

public class SearchElementInRotatedArray2 {
    public static void main(String[] args) {

    int[]arr={7,8,9,1,3,3,3,5,6};
        System.out.println(search(arr,arr.length,3));

}

    public static int search(int[]arr,int n,int target) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;

            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low=low=1;
                high=high-1;
                continue;

            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid])
                    high = mid - 1;

                else low = mid + 1;
            } else if (arr[mid] <= target && target <= arr[high])
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
