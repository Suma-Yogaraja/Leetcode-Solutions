class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int far=0;
        for(int trip[]:trips)
            far=Math.max(far,trip[2]);
        int[] arr=new int[far+1];
        for(int i=0;i<trips.length;i++){
            int value=trips[i][0],from=trips[i][1],to=trips[i][2];
            System.out.println(from + ": " + to + " :" + value);
            arr[from]+=value;
            arr[to]-=value;
        }
        //we have arr now where each value represent person at present iTh time
        int curr=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>capacity)
                return false;
        }
        return true;
    }
}