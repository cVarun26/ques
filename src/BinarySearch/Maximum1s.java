package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Maximum1s {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,1,1)));

        int n=3,m=4;

        System.out.println(rowWithMax1s(matrix,n,m));

    }

    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> mat, int n,int m){

        int index=-1;
        int countMax=0;

        for (int i = 0; i <n ; i++) {

            int countOnes=m-lowerBound(mat.get(i),m,1);
            if(countOnes>countMax){
                countMax=countOnes;
                index=i;
            }
        }
        return index;
    }

    private static int lowerBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;

        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr.get(mid) >= x) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
