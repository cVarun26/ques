package GreedyAlgo;


import java.util.Arrays;
import java.util.Comparator;

class Job{
    int id;
    int profit;
    int deadline;

   public Job(int id, int profit, int deadline){
        this.profit=profit;
        this.deadline=deadline;
        this.id=id;
    }
}

class JobComparator implements Comparator<Job>{
        @Override
        public int compare(Job o1, Job o2) {
            return o2.profit-o1.profit;
        }
    }

public class JobSequencing {
    public static void main(String[] args) {

        Job[] arr = new Job[4];
        arr[0] = new Job(1, 4, 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 2, 40);
        arr[3] = new Job(4, 2, 30);

        int ans=maxProfit(arr);
        System.out.println(ans);

    }

    public static int maxProfit(Job[]arr){
        JobComparator jc= new JobComparator();
        Arrays.sort(arr, jc);

        int totalProfit=0;
        int count=0;
        int maxDeadline=-1;

        for (int i = 0; i <arr.length-1 ; i++) {
            maxDeadline= Math.max(maxDeadline,arr[i].deadline);
        }
        int hash[]=new int[maxDeadline+1];

        for (int i = 0; i <=maxDeadline ; i++) {
            hash[i]=-1;
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = arr[i].deadline; j >0 ; j--) {
                if(hash[j]==-1){
                    count++;
                    hash[j]=arr[i].id;
                    totalProfit+=arr[i].profit;
                    break;

                }
            }
        }
        return totalProfit;
    }
}
