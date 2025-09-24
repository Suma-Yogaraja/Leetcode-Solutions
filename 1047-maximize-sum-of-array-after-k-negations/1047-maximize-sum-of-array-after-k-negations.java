class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        //min heap ,add all nums to min heap,while k>0,take min num,if not zero make it as negative,decrement k and add to heap
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums)
            pq.offer(num);
        while(k>0){
            int num=pq.poll();
                num=num*-1;
                pq.offer(num);
                k--;   
        }
        int sum=0;
        while(!pq.isEmpty()){
           sum+=pq.poll(); 
        }
        return sum;
    }
}