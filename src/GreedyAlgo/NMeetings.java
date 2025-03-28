package GreedyAlgo;


import java.util.*;

class Data{
    int start;
    int end;
    int pos;

    public Data(int start,int end, int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;

    }
}

class MeetingComparator implements Comparator<Data>{
    @Override
    public int compare(Data o1, Data o2) {
        if(o1.end>o2.end)return 1;
        else return -1;
    }
}


public class NMeetings {
    public static void main(String[] args) {
        int n = 9;
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 5, 7, 9, 9};

        int ans = maxMeetings(start,end,n);
        System.out.println(ans);
    }

    public static int maxMeetings(int[] start, int[] end, int pos){

        ArrayList<Data> arr=new ArrayList<>();
        for (int i = 0; i <start.length ; i++) {
            arr.add(new Data(start[i], end[i], i + 1));
        }

            MeetingComparator mc = new MeetingComparator();
            Collections.sort(arr,mc);

            int count=1;
            int freeTime=arr.get(0).end;

            for (int j = 1; j <start.length ; j++) {
                if(arr.get(j).start>freeTime){
                    count++;
                    freeTime=arr.get(j).end;
                }
            }
        return count;
    }
}
