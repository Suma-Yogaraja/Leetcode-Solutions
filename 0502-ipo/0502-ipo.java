class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        //greedy appraoch,create array that link capital and profit
    int n=profits.length;
        int[][] project=new int[n][2];//creating pairs of capita and profit
        for(int i=0;i<capital.length;i++)
            project[i]=new int[]{capital[i],profits[i]};//create pairs
        Arrays.sort(project,(a,b)->Integer.compare(a[0],b[0]));//sorting project in ascending order of capital
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//max Heap
         int i=0;
        for(int j=0;j<k;j++){
            while(i<n && project[i][0]<=w){
                pq.add(project[i][1]);//adding projects to heap
                i++;
            }
            if(pq.isEmpty())
                return w;
            w+=pq.poll();
        }
        return w;
    }
}